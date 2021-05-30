import java.util.*;
import java.io.*;

/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Main m = new Main();
        m.creatFile();
        m.WriteFile();
    }
    
    
    public void creatFile(){
        try{
            FileInputStream myFile = new FileInputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Workshop 8 Ex 1\\test1.txt");
            int i =0;
            String s = "";
            while((i=myFile.read()) !=  -1){
                if(i == 'y' || i == 'z'){
                    s += String.valueOf((char)i);
                    continue;
                }
                    
                s += String.valueOf((char)(i+2));
            }
            FileOutputStream outFile = new FileOutputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Workshop 8 Ex 1\\test2.txt");
            outFile.write(s.getBytes());
            outFile.close();
            
        }catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    public void WriteFile(){
        try{
            FileWriter myFile = new FileWriter("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Workshop 8 Ex 1\\test1.txt");
            myFile.write(sc.nextLine());
            myFile.close();
            System.out.println("Write successfully");
        }catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
