import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student x = new Student();
        String xId;String xName;double xMark;int xYear;int xMonth;int xDay;
        System.out.print("Enter id : ");
        xId = sc.next();
        sc.nextLine();
        System.out.print("Enter name : ");
        xName=sc.nextLine();
        System.out.println("Enter Date of birth : ");
        System.out.print("    Year: ");
        xYear=sc.nextInt();
        System.out.print("    Month: ");
        xMonth=sc.nextInt();
        System.out.print("    Day: ");
        xDay=sc.nextInt();
        Date xBirthDate = new Date(xYear,xMonth,xDay);
        System.out.print("Enter mark : ");
        xMark = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        x = new Student(xId,xName,xBirthDate,xMark);
        System.out.println(x);
    }

}
