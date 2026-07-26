class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class ValidateBST {

    static boolean isBST(Node root, long min, long max) {

        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data)
                && isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.left = new Node(6);
        root.right.right = new Node(8);

        if (isBST(root, Long.MIN_VALUE, Long.MAX_VALUE))
            System.out.println("Valid BST");
        else
            System.out.println("Not a BST");
    }
}