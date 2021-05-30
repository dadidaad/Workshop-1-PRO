
class Molecules {
    private String structure;
    private String name;
    private double weight;
    public Molecules(){
        
    }
    public Molecules(String structure , String name , double weight){
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }
    public String getStructure(){
        return structure;
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public void display(){
        System.out.println(structure + "    " +"\t"+name + "     " + "\t"+weight);
    }
}
