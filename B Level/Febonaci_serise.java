public class Febonaci_serise {

    public static void main(String[] args) {

        // 0 1 1 2 3 5 8 13 ..........N
        int a =0;
        int b =1;
        int c ;
        int n = 20;

        for (int i =1 ;i<=n;i++) {
            System.out.println(a);
            c = a+b;
            a =b;
            b = c;
        }

    }
}
