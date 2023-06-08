
// Lecture name - Recursion in one sohot 9 Besrt problems
// Tower of Hanoi

public class Recursion8 {

    public static void  towerOfHanoi(int n, String source, String helper, String destnation)
    {
        if(n==1) {
            System.out.println("transfer disk"+ "from "+source+"to " +destnation);
        }
        towerOfHanoi(n-1,source,destnation,helper);
        System.out.println("Transfer Disk" + n +"From "+source+ destnation);
towerOfHanoi(n-1,helper,source,destnation);
    }


    public static void main(String[] args) {

        int n = 1;
        towerOfHanoi(n,"S","H","D");


    }
}
