import java.util.*;
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DictionaryList dc = new DictionaryList();
        dc.create();
        int choice;
        System.out.println("1. Add new word to dictionary");
        System.out.println("2. Search word in dictionary");
        System.out.println("3. Show all word in dictionary");
        System.out.println("4. Exit");
        while(true){
            System.out.print("Your choice: ");
            choice=Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    dc.addWord();
                    break;
                case 2:
                    dc.searchWord();
                    break;
                case 3:
                    dc.display();
                    break;
                case 4:
                    return;
                default:
            }
        }
    }

}
