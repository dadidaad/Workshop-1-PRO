package workshop.pkg2.ex1;

/**
 *
 * @author Vo Thanh Dat 
 */
public class Workshop2Ex1 {
    public static void main(String[] args) {
        System.out.println("Using for");
        for(int i = 2; i<=10;i+=2)
            System.out.print(i+ " ");
        int i =2;
        System.out.println();
        System.out.println("Using while");
        while(i <= 10)
        {
            System.out.print(i+ " ");
            i+=2;
        }
    }

}
