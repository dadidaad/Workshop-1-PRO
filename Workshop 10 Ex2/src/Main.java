import java.util.*;
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlowerList fl = new FlowerList();
        System.out.println("1.Add new flower to list");
        System.out.println("2.Display the list ");
        System.out.println("3.Sort the list by price");
        System.out.println("4.Search flower in the list");
        System.out.println("5.Delete one flower in the list");
        while(true){
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    while(true){
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        if(name.equals("0"))    break;
                        System.out.print("Enter price: ");
                        double price = Double.parseDouble(sc.nextLine());
                        System.out.print("Enter color: ");
                        String color = sc.nextLine();
                        Flower x = new Flower(name, price, color);
                        fl.add(x);
                        System.out.println();
                    }
                    break;
                case 2:
                    fl.display();
                    break;
                case 3:
                    fl.sort();
                    System.out.println("After sort:");
                    fl.display();
                    break;
                case 4:
                    System.out.print("Enter flower name your want to search: ");
                    String xName = sc.nextLine();
                    System.out.print("Enter price: ");
                    double xPrice = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter color: ");
                    String xColor = sc.nextLine();
                    Flower y = new Flower(xName, xPrice, xColor);
                    fl.search(y);
                    break;
                case 5:
                    fl.display();
                    System.out.print("Enter position of flower you want to delete: ");
                    int pos = Integer.parseInt(sc.nextLine());
                    fl.delete(pos);
                    System.out.println("After delete , new list is: ");
                    fl.display();
                    break;
                default:
                    return;
            }
        
        }
    }

}
