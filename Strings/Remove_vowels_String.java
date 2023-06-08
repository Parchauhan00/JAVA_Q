public class Remove_vowels_String {

    public static boolean isVowel(char arr[], int index) {
        char ch = arr[index];
        if(ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch =='U') {
            return true;
        }

        return false;

    }
    public static void removeVowels(String s) {
        StringBuilder str1 = new StringBuilder();

        char ch[] = s.toCharArray();
 //int index = 0;

        for (int i =0;i< ch.length-1;i++) {
            if(i<ch.length && isVowel(ch,i) == false) {
//                ch[index] = ch[i];
//                index++;
                str1.append(ch[i]);
            }

        }
//        for (int i =0;i<index;i++) {
//            System.out.println(ch[i]);
//        }
        System.out.println(str1);
    }
    public static void main(String[] args) {

        String str = "pickachu";
        removeVowels(str);
    }
}
