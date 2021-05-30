
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static void main(String[] args) {
        String xStruct;
        String xName;
        double xWeight;
        Molecules x = new Molecules();
        x.display();
        xStruct = "A1";xName ="Hoa";xWeight =20;
        x =  new Molecules(xStruct,xName,xWeight);
        x.display();
        x = new Molecules(xStruct,xName,-10);
        x.display();
        x = new Molecules(xStruct,xWeight);
        x.display();
    }

}
