
//Print factorial Of No n

public class Recursion4 {

    public static int printFact(int n ) {

        if(n==0) {
            return 1;
        }
        System.out.println(n);
      int   calculatefact = n*printFact(n-1);
           return calculatefact ;
    }

    public static void main(String[] args) {
    int n = 5;
        System.out.println(printFact(n));

    }
}
