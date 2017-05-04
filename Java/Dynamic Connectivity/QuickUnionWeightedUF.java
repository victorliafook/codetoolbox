public class QuickUnionWeightedUF{
	private int[] data;
	private int[] weights;
	
	public QuickUnionWeightedUF(int n){
		data = new int[n];
		for(int i = 0; i < n; i++){
			data[i] = i;
			weights[i] = 1;
		}
	}
	
	public boolean connected(int p, int q){
		return root(p) == root(q);
	}
	
	public void union(int p, int q){
		int pr = root(p);
		int qr = root(q);
		if(weight[p] <= weight[q]){
			data[pr] = qr
			weight[pr] += weight[qr];
		}else{
			data[qr] = pr;
			weight[qr] += weight[pr];
		}
	}
	
	private int root(int p){
		while(data[p] != p){
			p = data[p];
		}
		return p;
	}
	
	
}