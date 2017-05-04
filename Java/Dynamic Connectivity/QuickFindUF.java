public class QuickFindUF{
	private int[] data;
	
	public QuickFindUF(int n){
		data = new int[n];
		for(int i = 0; i < n; i++){
			data[i] = i;
		}
	}
	
	public boolean connected(int p, int q){
		return data[p] == data[q];
	}
	
	public void union(int p, int q){
		if(data[q] != data[p]){
			for(int el : data){
				if(el == data[p])
					el = data[q]);
			}
		}
	}
	
}