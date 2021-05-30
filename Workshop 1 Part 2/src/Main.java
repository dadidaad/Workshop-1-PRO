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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour;
        int minutes;
        System.out.print("Enter hour = ");
        hour=sc.nextInt();
        System.out.print("Enter minutes = ");
        minutes=sc.nextInt();
        System.out.println("Total = " +(hour*60 + minutes)+" minutes");
    }
    
}
