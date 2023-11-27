
public class BST {
	public class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
		
		public int getData(){
			return data;
		}
	}
	
	private Node root;
	public BST() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void addNode(int value) {
		Node nn = new Node(value);
		
		if(isEmpty())
			root = nn;
		else {
			Node trav = root;
			while(true) {
				if(value < trav.data) {
					if(trav.left==null) {
						trav.left = nn;
						break;
					}
					else
						trav = trav.left;
				}
				else {
					if(trav.right==null) {
						trav.right = nn;
						break;
					}
					else
						trav = trav.right;
				}
			}
		}
	}
	
	public Node[] binarySearchWithParent(int key) {
		Node trav = root;
		Node parent = null;
		while(trav!=null){
			if(key == trav.data)
				break;
			parent = trav;
			if(key<trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		if(trav==null)
			parent = null;
		return new Node[] {trav, parent};
	}
	
	public void deleteNode(int key) {
		Node arr[] = binarySearchWithParent(key);
		Node temp = arr[0], parent = arr[1];
		
		if(temp==null)
			return;
		
		if(temp.left!=null && temp.right!=null) {
			Node pred = temp.left;
			parent = temp;
			while(pred.right!=null) {
				parent = pred;
				pred = pred.right;
			}
			temp.data = pred.data;
			temp = pred;
		}
		if(temp.left==null) {
			if(temp==root)
				root = temp.right;
			else if(temp==parent.left)
				parent.left = temp.right;
			else
				parent.right = temp.right;
		}
		else {
			if(temp==root)
				root = temp.right;
			else if(temp==parent.left)
				parent.left = temp.left;
			else
				parent.right = temp.left;
		}
	}
	
	public void preorder(Node trav) {
		if(trav==null)
			return;
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}
	
	public void preorder() {
		System.out.print("preorder: ");
		preorder(root);
		System.out.println();
	}
	
	public void inorder(Node trav) {
		if(trav==null)
			return;
		inorder(trav.left);
		System.out.print(" " + trav.data);
		inorder(trav.right);
	}
	
	public void inorder() {
		System.out.print("Inorder: ");
		inorder(root);
		System.out.println();
	}
	
	public void postorder(Node trav) {
		if(trav==null)
			return;
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(" " + trav.data);
	}
	
	public void postorder() {
		System.out.print("postorder: ");
		postorder(root);
		System.out.println();
	}
}












