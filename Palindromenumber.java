import java.util.*;
public class Palindromenumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int a=sc.nextInt();
        int r,q,d=0,i;
        q=a;
        for(i=0;a!=0;i++){
            r=a%10;
            a=a/10;
            d=d*10+r;
        }
        if(d==q){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
}