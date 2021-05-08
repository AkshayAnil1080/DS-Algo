package graphs;
import java.util.*;
public class BFS {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,1,3);
    	addEdge(adj,3,4);
    	addEdge(adj,2,4);
		
		System.out.println("Following is Breadth First Traversal: "); 
	    BFS(adj,V,0);
		
	}
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 
//1 add source in queue
//2 mark visited and poll it and push the adjacent elements(if vis is false) from adj list.
//3 repeat step 2 until q is empty
// TC : O(V+E) ASC : O(V) - all nodes goes exactly once in queue
	static void BFS(ArrayList<ArrayList<Integer>> adj,int V,int s) 
	{ 
		boolean[] visited=new boolean[V]; 
    	for(int i = 0; i < V; i++) 
    		visited[i] = false; 
    
    	Queue<Integer> q=new LinkedList<>();
    	
    	visited[s] = true; 
    	q.add(s); 
    
    	while(q.isEmpty()==false) 
    	{ 
    		int u = q.poll(); 
    		System.out.print(u + " "); 
    		 
    		for(int v:adj.get(u)){
    		    if(visited[v]==false){
    		        visited[v]=true;
    		        q.add(v);
    		    }
    		} 
    	} 
	} 

}
