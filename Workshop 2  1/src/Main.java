
/**
 *
 * @author Vo Thanh Dat 
 */
public class Main {
    public static void display(int[] arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();       
    }
    public static int max (int[] b){
        int max = b[0];
        for(int i = 0 ; i < b.length ; i++){
            if(b[i] > max)
                max = b[i];
        }
        return max;
    }
    public static int min (int[] b){
        int min = b[0];
        for(int i = 0 ; i < b.length ; i++){
            if(b[i] < min)
                min = b[i];
        }
        return min;
    }
    public static void sort5firstelements(int[] b){
        for(int i = 0 ; i < 5 ; i++)
        {
            for(int j = 0 ; j < 5 - i -1 ; j++)
            {
                if(b[j] > b[j + 1])
                {
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
    }
    public static void sort(int[] b){
        for(int i = 0 ; i < b.length ; i++)
        {
            for(int j = 0 ; j < b.length - i -1 ; j++)
            {
                if(b[j] > b[j + 1])
                {
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] b = {9,6,15,5,4,7,2,8};
        System.out.println("max : " + max(b));
        System.out.println("min : " + min(b));
        sort5firstelements(b);
        System.out.println("Sort first 5 elements:");
        display(b);
        sort(b);
        System.out.println("Sort all: ");
        display(b);
        
    }

}
