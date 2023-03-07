package classOperation;

public class recursion {
    public static void methodRecursion(int data){
        if(data == 0){
            System.out.println("!Finzalizado");
        } else {
            System.out.println(data);
            methodRecursion(data -1);
        }
    }

}
