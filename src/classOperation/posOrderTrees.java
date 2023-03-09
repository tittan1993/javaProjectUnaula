package classOperation;

import java.util.Scanner;

class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = null;
        derecho = null;
    }
}
public class posOrderTrees {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la lista de valores en postorden separados por espacios: ");
        String[] valoresString = scanner.nextLine().split(" ");
        int[] postorden = new int[valoresString.length];

        for (int i = 0; i < valoresString.length; i++) {
            postorden[i] = Integer.parseInt(valoresString[i]);
        }

        int[] index = {postorden.length - 1};
        Nodo raiz = construirArbol(postorden, index, 0, postorden.length - 1);
    }


    public static Nodo construirArbol(int[] postorden, int[] index, int bajo, int alto) {
        if (bajo > alto || index[0] < 0) {
            return null;
        }

        Nodo nodo = new Nodo(postorden[index[0]--]);

        if (bajo == alto) {
            return nodo;
        }

        int i;
        for (i = bajo; i <= alto; i++) {
            if (postorden[index[0]] > postorden[i]) {
                break;
            }
        }

        nodo.derecho = construirArbol(postorden, index, i, alto);
        nodo.izquierdo = construirArbol(postorden, index, bajo, i - 1);

        return nodo;
    }

}
