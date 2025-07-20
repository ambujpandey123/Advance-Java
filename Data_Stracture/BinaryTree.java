public class BinaryTree {
    static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
	}
	
}
    static class binaarytree {
    	public static int idx=-1;
		 public static Node buildTree(int nodes[]) {
			 if(nodes[++idx] == -1) {
				 return null;
			 }
			 Node newNode = new Node(nodes[idx]);
			 newNode.left = buildTree(nodes);
			 newNode.right = buildTree(nodes);
			return newNode;
		 }
	}
	public static void showTree(Node root) {
    	   if(root != null) {
    		System.out.println(root.data);
    		showTree(root.left);
    		showTree(root.right);
    	}
    	return;
    }
	public static void main(String[] args) {
		 int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
		binaarytree tree = new binaarytree();
		Node root = tree.buildTree(nodes);
		showTree(root);
		System.out.println("Root Node: "+ root.data);

	}

}

// It's a PreOrder Traversal (root, left, right)
// The tree Looks Like This :
//       1
//      / \
//     2   3
//    / \  / \
//   4   5 6  7
