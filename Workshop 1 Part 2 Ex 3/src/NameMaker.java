/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class NameMaker {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first=sc.next();
        System.out.print("Enter your middle name: ");
        String middle=sc.next();
        System.out.print("Enter your last name: ");
        String end=sc.next();
        System.out.println("Hello " + first +" "+middle +" "+end);
    }
}
