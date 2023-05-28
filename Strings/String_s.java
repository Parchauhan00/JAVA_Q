import java.util.Scanner;

public class String_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        for (int i = 0;i<name.length();i++) {
            System.out.println(name.charAt(i));
        }
    }
}
