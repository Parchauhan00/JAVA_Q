public class String_equalFunction {
    public static void main(String[] args) {
        String s1 = "Pru";
        String s2 = "Pru";
        String s3 = new String("Pru");  // Interning
        if (s1 == s2) {  // Whenever you create a String without new keyword then
                         // that String points previous String;
            // if we have to use strings value then we can't use == ,because == dekhta ha ki object level pr same ha kya
            // if we want to check value of two string then we have to use equals function it return boolean type value true or false
            System.out.println("Strings are equal");
        }else System.out.println("Strings are not equal");
        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else System.out.println("Strings are not equal");

        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }






    }
}
