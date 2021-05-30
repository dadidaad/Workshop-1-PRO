import java.util.*;
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileStudent fs = new FileStudent();
        int choice;
        System.out.println("    Menu");
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("1. Add a list of students and save to file");
        System.out.println("2. Loading list of students from a file");
        System.out.println("3. Exit");
        System.out.println();
        while(true){
        System.out.print("Your choice: ");
        choice = Integer.parseInt(sc.nextLine());
        switch(choice){
                case 1:
                    fs.writeStudent();
                    break;
                case 2:
                    fs.readStudent();
                    break;
                default:
                    
            }
        if(choice == 0) break;
        }
        System.out.println();
    }

}
