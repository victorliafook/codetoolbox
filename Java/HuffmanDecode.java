/*  
The decode method receives as input a binary string, following the Huffman code as well as a (binary) frequency tree. 
More frequent characters are assigned shorter codewords and less frequent characters are assigned longer codewords.

It prints the decoded string, as determined by the tree.

class Node{
	public  int frequency; // the frequency of this tree
    public  char data;
    public  Node left, right;
}
*/ 

void decode(String s, Node root){
    char[] charArr = s.toCharArray();
    Node trav = root;
    for(char c : charArr){
        if(c == '0'){
            trav = trav.left;
        }else if(c == '1'){
            trav = trav.right;
        }
        if(trav.left == null && trav.right == null){
            
            System.out.print(trav.data);
            trav = root;
        }  
    }           
}
