
import java.util.Arrays;


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
    public static boolean checksubAnagram(String s1,String s2){
        for (int i = 0; i < s2.length(); i++) {
            if(!s1.contains(s2.charAt(i)+"")){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String x = "ABCBDE";
        String y = "ACBDBE";
        String z = "ACBDE";
        boolean check = false;
        boolean anagram1 = new Main().checkAnagram(x, y);
        boolean anagram2 = new Main().checkAnagram(x, z);
        boolean subanagram = new Main().checksubAnagram(x, z);
        if(checkAnagram(x,y) == true){
            System.out.println("y is an anagram of x? " + anagram1);
        }
        if(checkAnagram(x,z) == false){
            System.out.println("z is an anagram of x? " + anagram2);
        }
        System.out.println("z is an sub-anagram of x? " + subanagram);
           }
}
