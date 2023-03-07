package classOperation;

public class fibonacci {
    public static int fibonacciMetho(int data){
        if(data == 0 || data == 1) {
            return data;
        } else {
            return fibonacciMetho(data - 1) + fibonacciMetho(data - 2);
        }
    }
}
