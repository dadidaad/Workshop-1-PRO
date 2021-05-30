abstract class Person {
    private String name;
    Person(){
        
    }
    Person(String name){
        this.name=name;
    }
    abstract double getSalary();
}
