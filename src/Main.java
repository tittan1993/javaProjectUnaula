import classOperation.*;


// trabajo presentado por Alejandro gil, johan arias, harold arboleda
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //leer número
        int number;
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Digite el número a operar");
        number = getNumber.nextInt();

        // Menu
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //

        while(!salir){

            System.out.println("\n 1. Factorial");
            System.out.println(" 2. Recursividad descendente");
            System.out.println(" 3. Fibonacci");
            System.out.println(" 4. arboles en PreOrden");
            System.out.println(" 5. arboles en inOrden");
            System.out.println(" 6. arboles en PosOrden");
            System.out.println(" 7. salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    factorial getFactorial = new factorial();
                    System.out.println("\n el factorial de " + number + " es " + getFactorial.methodFactor(number));
                    break;
                case 2:
                    recursion getRecursion = new recursion();
                    System.out.write('\n');
                    getRecursion.methodRecursion(number);
                    System.out.write('\n');
                    break;
                case 3:
                    fibonacci getFibonacci = new fibonacci();
                    for(int i = 0; i < number; i++){
                        System.out.print(getFibonacci.fibonacciMetho(i) +  " ");
                    }
                    break;
                case 4:
                    preOrderTrees getTrees = new preOrderTrees();
                    getTrees.main();
                    System.out.write('\n');
                    break;

                case 5:
                    inorderTrees getTreesInorder = new inorderTrees();
                    getTreesInorder.main();
                    System.out.write('\n');
                    break;

                case 6:
                    posOrderTrees getTreesPreorden = new posOrderTrees();
                    getTreesPreorden.main();
                    System.out.write('\n');
                    break;

                case 7:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 7");
            }

        }

    }
}