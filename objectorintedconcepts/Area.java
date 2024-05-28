import java.util.*;
class Circle{
      int r;
       double area(int r){//method che aiya hu void lakhu to comments vadu ave
       double a=3.14*r*r;//method ma cal karavyu
       //System.out.print(a);
       return a;
     }
}
        

public class Area{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);//scanf
        Circle c=new Circle();//class ne call karyo
        System.out.print("enter the radius");
        int r=sc.nextInt();
        double a=c.area(r);
        //c.area(r);
         System.out.print(a);
    }
}

