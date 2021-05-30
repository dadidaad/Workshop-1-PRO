import java.util.*;
public class GenericCar<T> {
    ArrayList <T> t = new ArrayList<>();
    static Scanner sc= new Scanner(System.in);
    public GenericCar() {
    }
    public void add(T b){
        t.add(b);
    }
    public void display(){
        int count=0;
        for (T o : t) {
            ++count;
            System.out.println(count+". "+o.toString());
        }
    }
    public void getSize(){
        System.out.println("The number item of t: "+t.size());
    }
    public void checkEmpty(){
        if(t.isEmpty()) System.out.println("t is empty");
        else System.out.println("t is not empty");
    }
    public void delete(int pos){
        for (int i = 0; i < t.size(); i++) {
            if(i == pos-1)    t.remove(i);
        }
    }

}
