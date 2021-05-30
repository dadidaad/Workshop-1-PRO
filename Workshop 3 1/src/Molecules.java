public class Molecules {
    private String  struct;
    private String  name;
    private double weight;
    public Molecules(){
        
    }
    public Molecules(String struct,String name,double weight){
        this.struct = struct;
        this.name =name;
        this.weight=weight;
        if(weight <=0) this.weight =0;
    }
    public Molecules(String struct,double weight){
        this.struct=struct;
        this.name ="Unknown";
        this.weight =weight;
    }
    public void display(){
        System.out.println(struct + ", " + name  + ", " +weight);
    }
}
