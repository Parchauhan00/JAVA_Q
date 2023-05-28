
// For a given set of Strings, print the largest string
public class LargestString {
    public static void main(String[] args) {
      String fruits[] = {"apple","mango","banana"};

      String largest = fruits[0];                          // 0 : equal
      for (int i =1;i< fruits.length;i++) {                // < 0 : -ve  st1<st2
         if (largest.compareToIgnoreCase(fruits[i]) <0 ) { // > 0 : +ve  st1>st2
             largest = fruits[i];
         }
      }
        System.out.println(largest);
    }
}
