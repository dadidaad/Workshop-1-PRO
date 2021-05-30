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
        Scanner sc= new Scanner(System.in);
        System.out.print("Time Start: ");
        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        System.out.print("Last minutes = ");
        int last=sc.nextInt();
        hour+=last/60;
        minutes+=last%60;
        if(minutes >= 60 )
        {
            hour+=1;
            minutes-=60;
        }
        System.out.println("Time end = " + hour +":"+ minutes);
    }
}
