import java.util.Scanner;

public class Prime_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        System.out.println("Enter No ");
        int n = sc.nextInt();

        for (int i =2; i<=n-1;i++) {
            if (n % i == 0) {
                temp = temp+1;
            }
        }
            if (temp!=0) {
                System.out.println("Not Prime");
            }
            else {
                System.out.println(" is Prime");
            }

    }
}
