

public class Ordering {
    String pcode;
    String ccode;
    int quantity;

    public Ordering() {
    }

    public Ordering(String pcode, String ccode, int quantity) {
        this.pcode = pcode.toUpperCase();
        this.ccode = ccode.toUpperCase();
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%-7s |    %-6s |       %d", pcode, ccode, quantity);
    }
    
}
