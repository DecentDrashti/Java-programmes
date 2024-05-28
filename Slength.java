import java.util.*;
public class Slength{
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string");
        String d=sc.nextLine();
        int a=d.length();
        for(int i=(a/2);i<a;i++){
           char b=d.charAt(i);
           System.out.print(b);
        }
        
    }
}