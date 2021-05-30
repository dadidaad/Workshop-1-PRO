import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner nhap = new Scanner(System.in);
        RightTriangle rt = new RightTriangle();
        while (true) {
            try{
            System.out.print("Enter side a: ");
            a=Integer.parseInt(nhap.nextLine());
            System.out.print("Enter side b: ");
            b=Integer.parseInt(nhap.nextLine());
            System.out.print("Enter side c: ");
            c=nhap.nextInt();
            rt = new RightTriangle(a, b, c);
            System.out.println("This is a right triangle!");
            }
            catch(InputMismatchException e){
                System.out.println("Wrong input!! Try again ");
                nhap.nextLine();
                continue;
                }
            catch (IllegalTriangleException e1) {
                    System.out.println(e1.getMessage());
                } 
            catch (IllegalRightTriangleException e2) {
                    System.out.println(e2.getMessage());
                }
            System.out.print("Continue?(Y/N):");
                        char chon = nhap.next().toUpperCase().charAt(0);
                        nhap.nextLine();
                        if(chon != 'Y')
                            break;
         }
    }
}
