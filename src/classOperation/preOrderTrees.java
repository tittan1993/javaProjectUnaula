package classOperation;

import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class preOrderTrees {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        TreeNode root = buildTree(sc);
        preOrderTraversal(root);
    }

    public static TreeNode buildTree(Scanner sc) {
        System.out.println("ingrese el valor del nodo: ");
        int val = sc.nextInt();
        if (val == -1) { // Si el valor es -1, no hay más nodos.
            return null;
        }
        TreeNode node = new TreeNode(val);
        System.out.println("Introduzca el hijo izquierdo de " + val);
        node.left = buildTree(sc);
        System.out.println("Introduzca el hijo derecho de " + val);
        node.right = buildTree(sc);
        return node;
    }

    public static void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
}
