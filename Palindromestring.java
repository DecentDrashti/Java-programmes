import java.util.*;
public class Palindromestring{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string");
        String d=sc.next();
        String p="";
        int i;
        int a=d.length();
        for(i=(a-1);i>=0;i--){
            p=p+d.charAt(i);
        }
        if(d.equals(p)){//string ne compare karva
            System.out.println("string is palindrome");

        }else{
            System.out.println("sring is not palindrome");
        }
    }
}//char ch=sc.next()CharAt(0)