
import java.util.*;
public class DictionaryList {
    public static Scanner sc = new Scanner(System.in);
    ArrayList<DictionaryWord> t = new ArrayList<>();
    public void create(){
        t.add(new DictionaryWord("bank robber", "Steals money from a bank"));
        t.add(new DictionaryWord("burglar", "Breaks into a home to steal things"));
        t.add(new DictionaryWord("forger", "Makes an illegal copy of something"));
        t.add(new DictionaryWord("hacker", "Breaks into a computer system"));
        t.add(new DictionaryWord("hijacker", "Takes control of an airplane"));
        t.add(new DictionaryWord("kidnapper", "Holds someone for ransom money"));
        t.add(new DictionaryWord("mugger", "Attacks and steals money from someone"));
        t.add(new DictionaryWord("murderer", "Kills another person"));
    }
    public void display(){
        int count=0;
        Collections.sort(t,new Comparator<DictionaryWord>(){
            @Override
            public int compare(DictionaryWord o1, DictionaryWord o2) {
                return o1.getWord().compareTo(o2.getWord());
            }
        });
        for(int i = 0; i<t.size();i++){
            ++count;
            System.out.println("<<"+count+">> "+t.get(i).toString());
            System.out.println();
        }
        
    }
    public int checkword(String word){
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getWord().equalsIgnoreCase(word)){
                return i;
            }
        }
        return -1;
    }
    public void searchWord(){
        System.out.print("Enter word: ");
        String word = sc.nextLine();
        if(checkword(word) != -1){
            System.out.println(t.get(checkword(word)).toString());
        }
        else
            System.out.println("Not found");
    }
    public void addWord(){
        System.out.print("Enter word: ");
        String word = sc.nextLine();
        if(checkword(word) != -1){
            System.out.println("This word has been exists in list");
        }
        else{
            System.out.print("Enter meanings: ");
            String meanings = sc.nextLine();
            DictionaryWord x = new DictionaryWord(word, meanings);
            t.add(x);
            System.out.println("Add successful");
        }
    }    
}    
    
