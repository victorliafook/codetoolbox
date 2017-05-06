public class QuickUnionWeightedUF{
	private int[] data;
	private int[] weights;
	private int[] canonicals;
	private int components;
	
	public QuickUnionWeightedUF(int n){
		data = new int[n];
		components = n;
		for(int i = 0; i < n; i++){
			data[i] = i;
			weights[i] = 1;
			canonicals[i] = i;
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
		if(weight[pr] < weight[qr]){
			data[pr] = qr;
			weight[qr] += weight[pr];
			canonicals[qr] = Math.max(canonicals[qr], canonicals[pr]);
		}else{
			data[qr] = pr;
			weight[pr] += weight[qr];
			canonicals[pr] = Math.max(canonicals[qr], canonicals[pr]);
		}
				
	}
	
	//returns the canonical element of p's component
	public int find(int p){
		return canonicals[root(p)];
	}
	
	private int root(int p){
		while(data[p] != p){
			p = data[p];
		}
		return p;
	}
	
	//number of components
	private int count(){
		return components;
	}
	
}