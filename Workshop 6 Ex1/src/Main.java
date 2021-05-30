import java.util.*;
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    private static String removeDotSpace(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == ' ' || c == '.')
                continue;
            sb.append(c);
        }
        return sb.toString();
        
    }
    public static boolean checkAnagram(String s1,String s2){
        char[] sw1 = removeDotSpace(s1).toCharArray();
        char[] sw2 = removeDotSpace(s2).toCharArray();
        Arrays.sort(sw1);
        Arrays.sort(sw2);
        String news1 = new StringBuilder().append(sw1).toString();
        String news2 = new StringBuilder().append(sw2).toString();
        return news1.equals(news2);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.print("Enter string 1 : ");
        s1 = sc.next();
        sc.nextLine();
        System.out.print("Enter string 2 : ");
        s2 = sc.next();
        boolean anagram = new Main().checkAnagram(s1,s2);
        if(checkAnagram(s1,s2) == true){
            System.out.println("String is an Anagram of each other");
        }
        else 
            System.out.println("String is not an Anagram of each other ");
            
        
            
    }

}
