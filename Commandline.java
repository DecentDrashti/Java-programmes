import java.util.Scanner;
public class Commandline{
    public static void main(String[] args){
       if(args[0]charAt(0)>='A'&& args[0].charAt(0)<='Z'){
         System.out.print("true");
       }else{
         System.out.print("error");
       }
    }
}