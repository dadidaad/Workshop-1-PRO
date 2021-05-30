public class RightTriangle {
    private int a,b,c;
    public RightTriangle(){
        
    }
    public RightTriangle(int a,int b,int c) throws IllegalTriangleException,IllegalRightTriangleException{
        if(a + b < c || b + c < a || a + c < b) throw new IllegalTriangleException("This is not a triangle");
        else if(a * a + b * b != c * c && a * a + c * c != b * b && b * b + c * c != a * a)  throw new IllegalRightTriangleException("This is not a right triangle");
    }
    
}
