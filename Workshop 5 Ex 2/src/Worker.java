class Worker extends Person{
    private double hrs;
    private final double RATE=5.5;
    Worker(){
        
    }
    Worker(String name,double hrs){
        super(name);
        this.hrs=hrs;
    }
    double getSalary(){
        return hrs*RATE;
    }
    void display(){
        System.out.println("Worker salary : "+ getSalary());
    }
}
