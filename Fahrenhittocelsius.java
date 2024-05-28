import java.util.*;
public class Fahrenhittocelsius{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double f=sc.nextInt();
        double celsius=(f-32)*5/9;
    System.out.print(celsius);
}
}