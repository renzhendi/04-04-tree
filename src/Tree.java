
public class Tree<T> {

	private static class Node<T> {
		public T value;
		public Node<T> left;
		public Node<T> right;
		public Node(T value , Node<T> left, Node<T> right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
		public Node(T value) {
			this(value, null, null);
		}
	}

	private Node<T> root;
	
	/**
	 * Constructor
	 */
	public Tree() { root = null; }
	
	/**
	 * Size function block
	 * @param cur
	 * @return
	 */
	private int sizeH(Node<T> cur) {
		if (cur == null) { return 0; }
		else { return 1 + sizeH(cur.left) + sizeH(cur.right); }
	}
	public int size() { return sizeH(root); }
	
	/**
	 * 
	 */
	public void printInorder() {}
}
