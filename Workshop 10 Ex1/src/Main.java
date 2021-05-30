
import java.util.*;
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericCar gc = new GenericCar();
        System.out.println("1. Add new car to list");
        System.out.println("2. Display car in list");
        System.out.println("3. Show how many car in list");
        System.out.println("4. Check list is empty or not");
        System.out.println("5. Delete a car in list");
        System.out.println("6. Exit");
        while(true){
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            if(choice == 6) break;
            switch(choice){
                case 1:
                    while(true){
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        if(name.equals("0"))    break;
                        System.out.print("Enter price: ");
                        double price = Double.parseDouble(sc.nextLine());
                        System.out.print("Enter production: ");
                        String production = sc.nextLine();
                        System.out.println();
                        Car x = new Car(name, price, production);
                        gc.add(x);
                    }    
                    break;
                case 2:
                    gc.display();
                    break;
                case 3:
                    gc.getSize();
                    break;
                case 4:
                    gc.checkEmpty();
                    break;
                case 5:
                    System.out.print("Enter position you want to delete: ");
                    int pos = Integer.parseInt(sc.nextLine());
                    gc.delete(pos);
                    System.out.println("New list:");
                    gc.display();
                    break;
                default:
            }
        }
    }

}
