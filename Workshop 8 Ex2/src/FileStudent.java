
import java.util.*;
import java.io.*;
public class FileStudent {
    public void writeStudent(){
        while(true){
            String name;int age;double mark;
            Scanner sc = new Scanner(System.in);
            List<Student> t = new ArrayList<>();
            File file = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Workshop 8 Ex2\\src\\student.txt");
            try{
                FileWriter fin = new FileWriter(file, true);
                BufferedWriter demo = new BufferedWriter(fin);
                    System.out.print("Enter name: ");
                    name=sc.nextLine();
                    if(name.equals("0"))    break;
                    System.out.print("Enter age: ");
                    age=Integer.parseInt(sc.nextLine());
                    System.out.print("Enter mark: ");
                    mark=Double.parseDouble(sc.nextLine());
                    System.out.println();
                    Student x = new Student(name, age, mark);
                    t.add(x);
                    demo.write(x.toString());
                    demo.flush();
                    demo.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }    
    }
    public void readStudent(){
        File file = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Workshop 8 Ex2\\src\\student.txt");
        try{
            FileReader fwRead = new FileReader(file);
            BufferedReader br = new BufferedReader(fwRead);
            String line ="";
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            fwRead.close();
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
