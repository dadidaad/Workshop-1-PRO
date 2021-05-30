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
        System.out.println("Enter list of phone numbers");
        System.out.println("----------------------------------");
        int choice;
        int count=0;
        while(true){
            try{
                System.out.print("Type of phone number ? (1 - local phone, 2 - Inter phone number, 0 - exit): ");
                choice = sc.nextInt();
                if(choice == 0) break;
                switch(choice){
                    case 0:
                        break;
                    case 1:
                        PhoneNumber pn = new PhoneNumber();
                        System.out.print("Enter area code: ");
                        xArea = sc.nextInt();
                        System.out.print("Enter phone number: ");
                        xNumber = sc.next();
                        pn = new PhoneNumber(xArea,xNumber);
                        phone[count++] = pn;
                        break;
                    case 2:
                        IntPhoneNumber ipn = new IntPhoneNumber();
                        System.out.print("Enter country code: ");
                        xCountryCode = sc.next();
                        System.out.print("Enter area code: ");
                        xArea = sc.nextInt();
                        System.out.print("Enter phone number: ");
                        xNumber = sc.next();
                        ipn = new IntPhoneNumber(xCountryCode,xArea,xNumber);
                        phone[count++] =ipn;
                        break;
                    default:
                        System.out.println("No choice !! Try again");
                }            
            }
            catch(InputMismatchException e){
                System.out.println("Invalid !! Tryagain");
                sc.nextLine();
                continue;
            }
        }
        System.out.println();
        System.out.println("List of phone number:");
        System.out.println("----------------------------");
        for(int i=0;i<count;i++){
            phone[i].display();
        }
        System.out.println();
    }

}
