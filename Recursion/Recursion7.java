
//print (x)^n (Stack height = logn)



public class Recursion7 {
    public static int calculatePower(int x, int n){

        if(n==0) {
            return 1;
        }
        if (x ==0) {
            return 0;
        }
        //If n is even
        if(n%2==0) {
            return calculatePower(x,n/2)*calculatePower(x,n/2);
        }
        // if n is odd
        else {
            return calculatePower(x, x / 2) * calculatePower(x, x / 2) * x;
        }


    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int height = calculatePower(x,n);
        System.out.println(height);
    }
}
