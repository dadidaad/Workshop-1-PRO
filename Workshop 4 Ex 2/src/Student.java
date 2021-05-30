import java.text.SimpleDateFormat;
import java.util.Date;
class Student {
     private String id;
     private String name;
     private double mark;
     private Date birthDate;
     public Student(){
         
     }
     public Date birthDate(int xYear,int xMonth,int xDate){
         Date x = new Date(xYear-1900,xMonth-1,xDate);
         return (x);
     }
     public String getDateString(Date x){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String y = sdf.format(x);
        return (y);
    }
     public Student(String id,String name,Date birthDate,double mark){
         this.id =id;
         this.name=name;
         this.birthDate=birthDate;
         this.mark=mark;
     }
     public String toString(){
         String y = getDateString(birthDate);
         return id+", "+name+","+y+", "+mark;
     }
}
