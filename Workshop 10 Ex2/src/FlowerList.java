
import java.util.*;

class FlowerList{
    ArrayList<Flower> a = new ArrayList<>();

    public FlowerList() {
    }
    public void add(Flower x){
        a.add(x);
    }
    public void display(){
        int count=0;
        for(Flower o : a) {
            ++count;
            System.out.println(count+". "+o.toString());
        }
    }
    public void sort(){
        Collections.sort(a,new Comparator<Flower>(){
            @Override
            public int compare(Flower o1,Flower o2){
                if(o2.getPrice() < o1.getPrice())
                    return -1;
                else if(o2.getPrice() == o1.getPrice())
                    return 0;
                else return 1;
            }
        });
    }
    public void search(Flower x){
        boolean check = false;
        for (Flower o : a) {
            if(o.getName().equals(x.getName())) check = true;
        }
        if(check == true)   System.out.println("This flower is in the list");
        else    System.out.println("This flower is not exists");
    }
    public void delete(int pos){
        for (int i = 0; i < a.size(); i++) {
            if(i ==  pos-1) a.remove(i);
        }
    }
}
