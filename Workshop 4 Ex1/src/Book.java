class Book {
    private String title;
    private int pages;
    private double cost;
    private boolean fiction;
    public Book(){
        
    }
    public Book(String title ,int pages ,double cost,boolean fiction){
        this.title=title;
        this.pages=pages;
        this.cost=cost;
        this.fiction=fiction;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setPages(int pages){
        this.pages =pages;
    }
    public int getPages(){
        return pages;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public double getCost(){
        return cost;
    }
    public void setFiction(boolean fiction){
        this.fiction = fiction;
    }
    public boolean getFiction(){
        return fiction;
    }
     
    public void display(){
        System.out.println(title + "    " + pages + "   " + cost + "    " + fiction);
    }
}
