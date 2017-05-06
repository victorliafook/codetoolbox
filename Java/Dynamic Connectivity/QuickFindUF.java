public class QuickFindUF{
	private int[] data;
	private int components;
	
	public QuickFindUF(int n){
		data = new int[n];
		components = n;
		for(int i = 0; i < n; i++){
			data[i] = i;
		}
	}
	
	public boolean connected(int p, int q){
		return data[p] == data[q];
	}
	
	public void union(int p, int q){
		if(data[p] != data[q]){
			components--;
			for(int el : data){
				if(el == data[p])
					el = data[q]);
			}
		}
	}
	
	//number of components
	public int count(){
		return components;
	}
}