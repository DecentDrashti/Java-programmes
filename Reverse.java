import java.util.*;
public class Reverse{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int[] temp=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("a["+i+"]=");
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=(size-1);i>=0;i--){
                temp[j]=arr[i];
                j++;
            }
        for(int i=0;i<size;i++){
            arr[i]=temp[i];
            System.out.println(arr[i]);
        }
    }
}
