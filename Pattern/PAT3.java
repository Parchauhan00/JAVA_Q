public class PAT3 {
    public static void main(String[] args) {
        int m =50;
        int n =50;
        for (int i =0;i<m;i++) {
            for (int j =n-1-i;j>0;j--) {
                System.out.print(" ");
            }
            for (int k =0;k<=i;k++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
