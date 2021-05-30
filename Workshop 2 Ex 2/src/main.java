import java.util.Scanner;
/**
 *
 * @author Vo Thanh Dat 
 */
public class main {
    
    public static void display(int[] arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();       
    }
    
    public static void sort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr.length - i -1 ; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {9,6,15,5,4,7,2,8};
        sort(arr);
        display(arr);
        System.out.println(arr[n-1]);
    }

}
