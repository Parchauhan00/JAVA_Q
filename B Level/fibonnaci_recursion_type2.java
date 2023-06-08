

// print fibonnaci
// second type method print fibonnaci is in Recursion5 see it
public class fibonnaci_recursion_type2 {

public static void printFib(int n, int a, int b) {
int i = 0;
    if(i ==n) {
        return;
    }
    int c;

    c = a+b;
    System.out.println(c);

    printFib(n-1,b,c);

}

    public static void main(String[] args) {
    int n = 7 , i = 0;
    int a= 0,b = 1;
        System.out.println(a);
        System.out.println(b);
    printFib(n-2,a,b);
    }
}
