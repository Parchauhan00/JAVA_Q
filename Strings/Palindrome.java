public class Palindrome {
    public static void checkPalindrome(String arr) {
        int left = 0;
        int right = arr.length()-1;
        int count = 0;

        while (left<=right) {
            if (arr.charAt(left)!=arr.charAt(right)) {
                System.out.println("String are not Palindrome");
                count++;
            }
            left++;
            right--;
        }
    if (count==0) {
        System.out.println("Stirng are Palindrome");
    }
    }
public static boolean isPalindrome(String str) {
        for (int i =0;i<str.length()/2;i++) {
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
//                System.out.println("String are not Palindrome");
                return false;
            }
        }
        return true;
}
    public static void main(String[] args) {
        String str = "racecar";
        //checkPalindrome(str);
        System.out.println(isPalindrome(str));

    }
}
