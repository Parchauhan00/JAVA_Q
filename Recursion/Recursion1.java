public class Recursion1 {

    public static void printNo(int n) {
        if(n==0) {
            return;

        }
        System.out.println(n);
        printNo(n-1);
    }
    public static void main(String[] args) {
        int  n = 5;
        printNo(n);

    }
}
