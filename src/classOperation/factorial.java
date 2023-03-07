package classOperation;

public class factorial {
    public static int methodFactor(int data) {
        if(data == 0) {
            return 1;
        } else {
            return data * methodFactor(data - 1);
        }
    }
}
