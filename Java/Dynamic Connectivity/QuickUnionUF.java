public class QuickUnionUF{
	private int[] data;
	private int components;
	
	public QuickUnionUF(int n){
		data = new int[n];
		components = n;
		for(int i = 0; i < n; i++){
			data[i] = i;
		}
	}
	
	public boolean connected(int p, int q){
		return root(p) == root(q);
	}
	
	public void union(int p, int q){
		int pr = root(p);
		int qr = root(q);
		if(pr == qr) return;
		
		components--;
		data[pr] = qr;
	}
	
	private int root(int p){
		while(data[p] != p){
			p = data[p];
		}
		return p;
	}
	
	//number of components
	public int count(){
		
	}
}