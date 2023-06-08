
//Print No from 1 to 5

public class Recursion2 {
    public static void printNo(int n) {
        if(n==6) // Base conditon
        {
            return;
        }
        System.out.println(n);
        printNo(n+1);

    }
    public static void main(String[] args) {
        int n =1;
        printNo(n);
    }
}
