class Officer extends Person {
    private double bSalary;
    Officer(){
        
    }
    Officer(String name ,double bSalary){
        super(name);
        this.bSalary=bSalary;
    }
    double getSalary(){
        return bSalary;
    }
    void display(){
        System.out.println("Officer salary : " + getSalary());
    }
    
}
