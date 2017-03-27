/* 
Node is defined as:
     
class Node{ 
	int data;
	Node left;
	Node right;
}
*/

void preOrder(Node root) {
    if(root == null)
        return;
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
}

void inOrder(Node root) {
    if(root == null)
        return;
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
}

void postOrder(Node root) {
    if(root == null)
        return;
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
}

void LevelOrder(Node root){
    List<Node> list = new ArrayList<Node>();
    list.add(root);
    while(!list.isEmpty()){
        Node aux = list.get(0);
        list.remove(0);
        System.out.print(aux.data + " ");
        if(aux.left != null) list.add(aux.left);
        if(aux.right != null) list.add(aux.right);
    }
}
//calculating the height of a binary tree, recursively.
int height(Node root) {
    return  postOrderHeight(root);
}

int postOrderHeight(Node root){
    if(root == null)
        return -1;
    int lHeight = postOrderHeight(root.left);
    int rHeight = postOrderHeight(root.right);
    return Math.max(lHeight, rHeight) + 1;
}