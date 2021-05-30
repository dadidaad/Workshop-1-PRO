package pkgBook;

public class Book {
    private String title;
    private double cost;
    private int pages;
    private boolean fiction;
    public Book(){
        
    }
    public Book(String title,int pages,double cost,boolean fiction){
        this.title = title;
        this.cost = cost;
        this.pages = pages;
        this.fiction = fiction;
    }
    public String getTitle(){
        return title.toUpperCase();
    }
    public double getCost(){
        return cost;
    }
    public double getNewCost(){
        return cost+cost*0.1;
    }
    public String toString(){
        return title + " | " + pages + " | " + cost + " | " + fiction;
    }
}
