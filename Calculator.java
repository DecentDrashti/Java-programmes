import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans;
        char c=sc.next().charAt(0);
        switch(c){
          case '+':ans=a+b;
            System.out.print(ans);
           break;
          case '-':  ans=a-b;
          System.out.print(ans);
           break;
          case '*': ans=a*b;
          System.out.print(ans);
           break;
          case '/': ans=a/b;
          System.out.print(ans);
          break;
    }
}
}