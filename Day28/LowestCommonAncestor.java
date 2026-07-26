class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class LowestCommonAncestor {

    static Node LCA(Node root, int n1, int n2) {

        if (root == null)
            return null;

        if (root.data == n1 || root.data == n2)
            return root;

        Node left = LCA(root.left, n1, n2);
        Node right = LCA(root.right, n1, n2);

        if (left != null && right != null)
            return root;

        return (left != null) ? left : right;
    }

    public static void main(String[] args) {

        Node root = new Node(3);

        root.left = new Node(5);
        root.right = new Node(1);

        root.left.left = new Node(6);
        root.left.right = new Node(2);

        root.right.left = new Node(0);
        root.right.right = new Node(8);

        Node ans = LCA(root, 6, 2);

        System.out.println("LCA = " + ans.data);
    }
}