//(I,V,X,L=50,C=100,D=500,M=1000) STRING S
import java.util.*;

// public class Roman_Int{
//     public static void main(String []args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the roman number");
//         String s=sc.next();
//         int sum=0;
//         int value(char r){
//         if(r=='I')
//         return 1;
//          if(r=='V')
//         return 5;
//          if(r=='X')
//         return 10;
//          if(r=='L')
//         return 50;
//          if(r=='C')
//         return 100;
//          if(r=='D')
//         return 500;
//          if(r=='M')
//          return 1000;
//          return -1;
//         }
//         int sum=0,s1,s2;
//         for(int i=0;i<s.length;i++){
//              s1=value(s.CharAt(i));
//              if(i+1<s.length)
//              s2=value(s.CharAt(i+1));
//              if(s1>=s2){
//                  sum = sum+s1;
//              }else{
//                 sum=sum-s1;
//              }
//         }
//         System.out.println(sum);

//     }
// }
class Roman_Int {
    public int romanToInt(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the roman number");
        String s=sc.next();
        int res=0;
        int s1,s2;
        char I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
         
        for(int i=0;i<s.length();i++){
             s1=(int)s.CharAt(i);
             if(i+1<s.length())
             s2=(int)s.CharAt(i+1);
             if(s1>=s2)
                 res= res+s1;
             else
                res=res-s1;
        }
        return res;
    }
}