package pkgStudent;

public class Student {
    private String id;
    private String name;
    private double mark;
    public Student(){
        
    }
    public Student(String id,String name,double mark){
        this.id=id;
        this.name=name;
        this.mark=mark;
    }
    public String toString(){
        return id+", "+name+", "+mark;
    }
}
