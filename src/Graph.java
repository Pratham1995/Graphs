import java.util.LinkedList;

//Adjency Matrix Represenation
//Adjanency list 
public class Graph {
	
	private int V;
	private int E;
	private int[][] adjMatrix;
	private LinkedList<Integer>[] adj;
	
	public Graph(int nodes) {
		this.V=nodes;
		this.E=0;
		this.adjMatrix=new int[nodes][nodes];
		
		//Using Linked List
		this.adj=new LinkedList[nodes];
		for(int i=0;i<nodes;i++) {
			this.adj[i]=new LinkedList<>();
		}
	}
	
	public void AddEdge(int u,int v) {
		this.adjMatrix[u][v]=1;
		this.adjMatrix[v][u]=1;
		//using LinkedlIst
		this.adj[u].add(v);
		this.adj[v].add(u);
		E++;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(V+ "vertices"+ E +"Edges"+"\n");
		for(int v=0;v<V;v++) {
			sb.append(v+":");
			for(int w:adjMatrix[v]) {
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	//For linkedList
	/*public String toString1() {
		StringBuilder sb=new StringBuilder();
		sb.append(V+" "+"vertices"+" "+E+" "+"Edges"+"\n");
		for(int v=0;v<V;v++) {
			sb.append(v+":");
			for(int w:adj[v]) {
				sb.append(w+":");
			}
			sb.append("\n");
		}
		return sb.toString1();
		
		
	}*/
	
	public static void main(String args[]) {
		Graph g=new Graph(4);
		g.AddEdge(0, 1);
		g.AddEdge(1, 2);
		g.AddEdge(2, 3);
		g.AddEdge(3, 0);
		
		System.out.println(g);
		
		
	}
}
