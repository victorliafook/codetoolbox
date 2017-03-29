public class BinaryTreeNode<T extends Comparable>{
	private T data;	
	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;
	private int size;
	
	public BinaryTreeNode(T data){
		this.left = null;
		this.right = null;
		this.data = data;
		this.size = 0;
	}
	
	public void insertInOrder(T data){
		if(data.compareTo(this.getData()) <= 0){
			if(this.getLeft() == null){
				this.setLeft(new BinaryTreeNode<T>(data));
			}else{
				this.getLeft().insertInOrder(data);
			}
		}else{
			if(this.getRight() == null){
				this.setRight(new BinaryTreeNode<T>(data));
			}else{
				this.getRight().insertInOrder(data);
			}
		}
		this.size++;
	}
	
	public BinaryTreeNode<T> find(T data){
		if(this.data.equals(data))
			return this;
		if(data.compareTo(this.getData()) <= 0){
			return this.getLeft() != null ? this.getLeft().find(data) : null;
		}else{
			return this.getRight() != null ? this.getRight().find(data) : null;
		}
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
}
