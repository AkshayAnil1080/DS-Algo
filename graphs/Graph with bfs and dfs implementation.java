package graphs;

import java.util.*;

public class Graph {

	// 1. creating adjacency list which is actually an array of LInkedList.
	private LinkedList<Integer> adj[];
	
	public Graph (int v)   // passing the vertices of graph and intializing the array of LL.
	{
		adj = new LinkedList[v];
		for(int i = 0; i<v ;i++)
		{
			adj[i] = new LinkedList<Integer>();   //intializing the values in array as the vertices in Graph.
			
		}
	}
	
	public void addEdge(int source, int destination )   // 2. function to add edges of grpah in LL and the paramters will be source and destnation.
		{
			adj[source].add(destination);   // source in array and destination in the LL associated with source.
			adj[destination].add(source);   // since its undirected graph, so, dest in array and source in the LL associated with it.
			
		}
	
	// 5. implementing bfs : function with arguments as source and dest , and work is to calculate the shortest path.
	/// one visited boolean array is req of size adj list, and by default it has the value as false.
	// making a queue to add source and a parent array of size adj list to inform which node is introduced by which one.
	// making source introduced by -1 ,  
	// while loop till queue is empty, and have to make element poll, and if curr == dest ; break;  else visit each neighbour of the curr and insert in queue and mark as visited.
	// from where the curr neighbour will come form = > from the above made adj list=> it has all the node of graph in it.
	public int bfs( int source , int destination )
	{
		boolean vis[]= new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		parent[source]  = -1;
		vis[source] = true;
		
		while(!q.isEmpty())
		{
			int curr = q.poll();
			if (curr == destination)
			break;
		//else
			for(int neighbour : adj[curr])  // this will give a LL , of all the possible node to traverse
				if(!vis[neighbour])         // if neighbour not visited, mark it visiste and insert in queue.
					{
						vis[neighbour] = true;
						q.add(neighbour);
						parent[neighbour] =  curr;   // and is introduced by curr(the element by poll)
					}
		}
		// printing the distance form dest to source.
		int curr = destination;
		int distance = 0;
		
		
		while( parent[curr] != -1 )
			{
				System.out.print(curr + "->");
			curr = parent[curr];
			distance++;
			}
		return distance;
		
	}
	
	// 6. making recursive function of dfsUtil : DFS gaurantees the path exists or not, it may not give the shortest pat between the nodes. => function is boolean
	// arguments : source, destination and visited array for backtracking from visited nodes
	// now apply dfs on neighbours of each source.. and if the neighbour  is not visited , 
	// then we will check if via this neighbour can we the destination, so calling the dfs function recursively, and forget what this f(n) will do, have the recursive leap of faith.
	// it will give a true or false value, so this neighbour is connected to the dest, it will return true, else the f(n) line86 is itself in the for loop, it will work for next of the neighbours.
	// so after finishing the loop, if still not get the dest, it will return false.
	private boolean dfsUtil(int source , int destination, boolean vis[])
		{
		if (source == destination) return true;  // base case
		
		for( int neighbour: adj[source])
			{
				if(!vis[neighbour])
				{
					vis[neighbour] = true;
					boolean isConnected = dfsUtil(neighbour, destination, vis);
					if(isConnected) return true;
				}
			}

		return false;
		}
	
	// 6a. we have to crate a visited boolean array for dfsutil as i dont want to this work from main.
	public boolean dfs( int source, int destination) {
	    boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		return dfsUtil(source, destination, vis);
	}
	
	//6b lets see how dfs is implemented with stack 
	// will have source and dest as arg , and a boolean visited array is req.
	// creating a stack and push the source. 
	// and keep on popping the top element=curr and pushing its neighbours, marking them as visited till(while loop) stack is not empty
	//and add a base condition, if curr == dest  return true line(118) else no path is possible it will return false(130)
	public boolean dfsStack(int source, int destination)
	{
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		Stack<Integer> stack = new Stack<>();
		
		stack.push(source);
		
		while(!stack.isEmpty())
			{
				int curr = stack.pop();
				
				if( curr == destination) return true; // base
				for ( int neighbour : adj[curr])
					{
						if(!vis[neighbour])
							{
								vis[neighbour] = true;
							    stack.push(neighbour);
							}
					}
			}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method st ub
		// 3. implementing main
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of vertice and edges");
		
		int v  = sc.nextInt();
		int e = sc.nextInt();
		
		
		Graph graph = new Graph(v); // making an object graph from the class Graph.
		
		
		//4.taking the edges input add adding into the addEdge function.
		System.out.println("enter "+ e + " edges");
		for ( int i =0 ;i<e ;i++)
		{
			int source = sc.nextInt();
			int destination = sc.nextInt();
			graph.addEdge(source, destination);
		}
		
		System.out.println("Enter source and destination");
		int source = sc.nextInt();
		int destination  = sc.nextInt();
		
//		int distance =  graph.bfs(source, destination);
//		System.out.println("min distance is " + distance);
		
//	    System.out.println("possible " + graph.dfs(source, destination)); 
		
	System.out.println("possible " + graph.dfsStack(source, destination)); // dfs with stack
	}

}

