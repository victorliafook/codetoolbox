public class QuickUnionUF{
	private int[] data;
	
	public QuickUnionUF(int n){
		data = new int[n];
		for(int i = 0; i < n; i++){
			data[i] = i;
		}
	}
	
	public boolean connected(int p, int q){
		return root(p) == root(q);
	}
	
	public void union(int p, int q){
		data[root(p)] = root(q);
	}
	
	private int root(int p){
		while(data[p] != p){
			p = data[p];
		}
		return p;
	}
	
	
}