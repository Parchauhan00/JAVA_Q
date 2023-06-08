
// Count of character in a string ignore blank space
public class String_char_count {
    public static int countWords(String str) {
        int count =0;
        for (int i =0;i<str.length(); i++) {
            if (str.charAt(i)!= ' '){
                count++;
            }
        }
        return count++;
    }
    public static void main(String[] args) {
String str = "Hello Java language ha kya ";
        System.out.println(countWords(str));

    }
}
