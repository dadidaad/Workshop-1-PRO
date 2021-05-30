import java.util.*;
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneNumber[] phone = new PhoneNumber[1000];
        int xArea;String xNumber;String xCountryCode;
        int choice;
        int count=0;
        System.out.print("Enter number of phones n = ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println();
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                System.out.print("Enter area = ");
                xArea = Integer.parseInt(sc.nextLine());
                System.out.print("Enter phone number = ");
                xNumber = sc.nextLine();
                PhoneNumber x  = new PhoneNumber(xArea, xNumber);
                phone[count++] =x;
                System.out.println();
            }
            else{
                System.out.print("Enter area = ");
                xArea = Integer.parseInt(sc.nextLine());
                System.out.print("Enter phone number = ");
                xNumber = sc.nextLine();
                System.out.print("Enter country code = ");
                xCountryCode = sc.nextLine();
                IntPhoneNumber y  = new IntPhoneNumber(xCountryCode, xArea, xNumber);
                phone[count++] =y;
                System.out.println();
                
        }
        }
            for (int j = 0; j < count; j++) {
                phone[j].display();
            }
        System.out.println();
    }

}
