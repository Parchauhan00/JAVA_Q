public class SubString_s {
    public static String subString1(String str , int si , int ei) {
        String substr = "";
        for (int i = si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        // Substring
        String str = "HelloWorld";
        System.out.println(str.substring(5,7));
      //  System.out.println(subString1(str,2,5));
    }
}
