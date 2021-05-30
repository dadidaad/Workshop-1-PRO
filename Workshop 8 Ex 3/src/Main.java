import java.util.*;
import java.io.*;
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static void main(String[] args) throws IOException {    
    while(true){
        try{
    // Scanner for user input
    Scanner user = new Scanner( System.in ); 
    String  inputFileName;

    // prepare the input file
    System.out.print("Input File Name: ");
    inputFileName = user.nextLine().trim();
    File input = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Workshop 8 Ex 3\\src\\"+inputFileName );      
    Scanner scan = new Scanner( input );           
    FileReader fr = new FileReader(input);
    BufferedReader br = new BufferedReader(fr);
    String line = "";
    while((line = br.readLine()) != null){
        System.out.println(line);
    }
    // close the output file
    fr.close();
    br.close();
    }catch(FileNotFoundException e){
            System.out.println("File does not exists");
            continue;
    }
        break;
    }
    }

}
