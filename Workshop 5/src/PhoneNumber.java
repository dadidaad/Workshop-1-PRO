public class PhoneNumber {
    private int area;
    private String number;
    public PhoneNumber(){
        
    }
    public PhoneNumber(int area,String number){
        this.area=area;
        this.number=number;
    }

    public int getArea() {
        return area;
    }

    public String getNumber() {
        return number;
    }
    public void display(){
        System.out.println(area + " - " + number);
    }
}
