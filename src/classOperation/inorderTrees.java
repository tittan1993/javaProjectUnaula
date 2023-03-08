package classOperation;

import java.util.Scanner;

public class inorderTrees {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        TreeNode root = buildTree(sc);
        inOrderTraversal(root);
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

    public static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }
}
