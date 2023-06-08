public class Palindrome_No {
    public static void main(String[] args) {
        int n = 1215;

        int x = n;
        int reverse =0;
        for ( ; x!=0; ) {
            int remender = x%10;
            reverse = reverse*10+remender;
            x = x/10;
        }
        if (reverse == n) {
            System.out.println("Palindrom");
            System.out.println(reverse);
        }
        else {
            System.out.println("Nope");
            System.out.println(reverse);
        }
    }
}
