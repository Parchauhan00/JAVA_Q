public class Palindrome_String {
    public static void main(String[] args) {
        String str = "MOprOM";
        int l = str.length();
        int t = 0;
        for (int i =0;i<=str.length()/2;i++) {
            if (str.charAt(i) != str.charAt(l-1-i)) {
                t = t+1;
            }
        }
        if (t>0) {
            System.out.println( "Not palindrome");
        }
        else {
            System.out.println("Palindrome");
        }
    }


}
