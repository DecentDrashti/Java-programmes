import java.util.*;
public class Percentage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the subject marks");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        System.out.println("enter the total");
        double total=sc.nextDouble();
        double per;
        per=((a+b+c+d+e)/(5*total))*100;
        if(per>=60){
            System.out.println("first division");
        }
        else if(per>=50){
            System.out.println("second division");
        }
        else if(per>=40){
            System.out.println("third division");
        }
        else {
            System.out.println("fail");
        }
    }
}