import java.util.*;
class Rectangle {
    private double width;
    private double height;
    public Rectangle(){
        
    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width : ");
        width=sc.nextDouble();
        System.out.print("Enter height : ");
        height=sc.nextDouble();
    }
    public double Area(){
        return width*height;
    }
    public double Perimeter(){
        return 2*(width+height);
    }
    public void display(){
        System.out.println("Area = " + Area());
        System.out.println("Perimeter = " + Perimeter());
    }
}
