import java.util.Scanner;
class Atoms{
    private final int number;
    private final String symbol;
    private final String name;
    private final double weight;
    public Atoms(int number,String symbol,String name,double weight){
        this.number = number;
        this.symbol = symbol;
        this.name = name;
        this.weight = weight;
    }
    public int getNumber(){
        return number;  
    }
    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public String toString(){
        return this.number + "  " +this.symbol + "  " + this.name + "   " + this.weight;
    }

}
