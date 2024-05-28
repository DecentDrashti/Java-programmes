import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int a=sc.nextInt();
        int i;
        double d=Math.sqrt(a);
        for(i=2;i<=d;i++){
            if(a%i==0){
            System.out.println("not prime");
            return;
            }
                
            }
            System.out.println("prime");
        }
    }
