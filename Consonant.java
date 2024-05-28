import java.util.*;
public class Consonant{
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string");
        String d=sc.nextLine();
        String p="";
        int i,c=0,v=0;
        int a=d.length();
        for(i=(a-1);i>=0;i--){
           char b=d.charAt(i);
           if(b=='a'|| b=='A' || b=='e' || b=='E' || b=='i' ||b=='I' || b=='o' || b=='O' || b=='u' ||b=='U'){
            
            v++;
           }else{
            c++;
           }
        }
        System.out.print("consonents");
           System.out.println(+c);
           System.out.print("vowel");
           System.out.println(+v);
        }
}