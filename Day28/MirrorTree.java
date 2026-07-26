class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class MirrorTree {

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static Node mirror(Node root) {

        if (root == null)
            return null;

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);

        return root;
    }

    public static void main(String[] args) {

        Node root = new Node(4);

        root.left = new Node(2);
        root.right = new Node(7);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        root.right.left = new Node(6);
        root.right.right = new Node(9);

        System.out.print("Before Mirror: ");
        inorder(root);

        mirror(root);

        System.out.print("\nAfter Mirror: ");
        inorder(root);
    }
}