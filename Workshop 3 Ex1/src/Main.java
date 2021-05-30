import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Molecules[] mole = new Molecules[100];
        int i=0;
        String xStructure;String xName;double xWeight;
        Molecules x;
        System.out.println("Molecular Information:");
        System.out.println();
        while(true){
            System.out.print("Enter structure : ");
            xStructure = sc.next();
            if(xStructure.equals("0")==true)    break;
            System.out.print("Enter name : ");
            xName  = sc.next();
            System.out.print("Enter weight : ");
            xWeight = sc.nextDouble();
            sc.nextLine();
            System.out.println();
            x = new Molecules(xStructure,xName,xWeight);
            mole[i++] = x;
        }
        for(int j = 0 ;j < i;j++){
            mole[j].display();
        }
        System.out.println();
    }
}
