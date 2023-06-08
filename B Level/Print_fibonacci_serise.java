public class Print_fibonacci_serise {
    public static void main(String[] args) {
        int n = 20;
        int a= 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i= 0;i<n;i++) {
//            System.out.println(a);
//            System.out.println(b);
            c = a+b;
            System.out.println(c);
            a =b;
            b =c;

        }
    }
}
