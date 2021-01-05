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
		int distance =  graph.bfs(source, destination);
		System.out.println("min distance is " + distance);
	}

}
