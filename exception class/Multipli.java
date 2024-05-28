// class Multiplication{
// int x,y;
// public void getMultiplication(int x,int y){
//  int ans=x*y;
//  System.out.println(ans);
// }
// }
public class Multipli{
    public static void main(String[]args){
         Multiplication a=new Multiplication();
        try{
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int ans=x*y;
        System.out.println(ans);

        }
        catch(Exception e){
            System.out.println(e);
        }
     
    }
}