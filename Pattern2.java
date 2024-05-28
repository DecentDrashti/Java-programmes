public class Pattern2{
    public static void main(String[]args){
     int i,j;
     for(i=0;i<=2;i++){
        for(j=0;j<=i;j++){
            System.out.print("*");
        }System.out.println("");
      }
      for(i=1;i>=0;i--){
        for(j=0;j<=i;j++){
            System.out.print("*");
        }System.out.println("");
    }
    }
 }