public class PhoneNumber {
    private int area;
    private String number;
    public PhoneNumber(){
        
    }
    public PhoneNumber(int area,String number){
        this.area=area;
        this.number=number;
    }
    public void display(){
        System.out.print(area + " - " + number+"\n");
    }
}
