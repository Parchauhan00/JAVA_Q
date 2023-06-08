
//print (X)^n (Stack height = n)
public class Recursion6 {
    public static int calculatePower(int x, int n){

if(n==0) {
    return 1;
}
if (x ==0) {
    return 0;
}
int power =x*calculatePower(x,n-1);
return power;




    }

    public static void main(String[] args) {
     int x = 2;
     int n = 5;

    int height = calculatePower(x,n);
        System.out.println(height);
    }
}
