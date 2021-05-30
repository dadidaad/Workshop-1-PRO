import java.util.Scanner;
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atoms[] atom = new Atoms[10];
        System.out.println("Atomic Information");
        System.out.println("------------------");
        int i =0;
        Atoms x;
        while(true){
            System.out.print("Enter number : ");
            int xNumber = sc.nextInt();
            if(xNumber == 0)    break;
            System.out.print("Enter symbol : ");
            String xSymbol = sc.next();
            System.out.print("Enter name : ");
            String xName = sc.next();
            System.out.print("Enter weight : ");
            Double xWeight = sc.nextDouble();
            sc.nextLine();
            System.out.println();
            x = new Atoms(xNumber,xSymbol,xName,xWeight);
            atom[i++] = x;
        }
        System.out.println();
        for(int j = 0 ; j < i ; j++){
            System.out.println(atom[j]);
        }
        System.out.println();
        
    }

}
