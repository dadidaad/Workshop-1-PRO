import java.util.Scanner;
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book x = new Book();
        String xTitle;int xPages;double xCost;boolean xFiction;
        System.out.print("Enter title : ");
        xTitle=sc.nextLine();
        System.out.print("Enter pages : ");
        xPages=sc.nextInt();
        System.out.print("Enter cost : ");
        xCost=sc.nextDouble();
        System.out.print("Enter fiction(true/false) : ");
        xFiction=sc.nextBoolean();
        sc.nextLine();
        System.out.println();
        x  = new Book(xTitle,xPages,xCost,xFiction);
        x.display();
        System.out.println();
        System.out.print("Enter new cost : ");
        xCost=sc.nextDouble();
        x.setCost(xCost);
        System.out.println();
        x.display();
        
    }
}
