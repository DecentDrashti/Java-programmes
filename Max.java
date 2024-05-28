import java.util.*;
public class Max{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 3 number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is max");
            }else{
                System.out.println("c is max");

            }
        }else if(b>c){
            System.out.println("b is max");
        }else{
            System.out.println("c is max");
        }
    }
}