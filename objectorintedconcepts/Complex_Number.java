import java.util.*;
public class Complex_Number{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter real number1");
       int r1=sc.nextInt();
        System.out.println("enter imaginary number1");
       int i1=sc.nextInt();
        System.out.println("enter real number2");
       int r2=sc.nextInt();
        System.out.println("enter imaginary number2");
       int i2=sc.nextInt();
       Addition c1=new Addition(r1,i1);
       Addition c2=new Addition(r2,i2);
       c1.addNo(c2);
       
    }
}
class Addition{
     int realNo;
     int imgNo;
    Addition(int r, int i){
        realNo=r;
        imgNo=i;
    }
    void addNo(Addition C){
          int a1= this.realNo + C.realNo;
          int a2= this.imgNo + C.imgNo;
        //   int ans=a1+a2;
          System.out.println("ans="+a1+"+"+a2+"i");
    }
}

