import java.util.Scanner;
public class Cricket{
    public static void main(String []args){
         Scanner s = new Scanner(System.in);
         int runPerOver[][]=new int[3][6];
         for(int i=0;i<3;i++){
            for(int j=0;j<6;j++){
                System.out.print("enter the run taken in over number " +(i+1)+"and ball number " +(j+1)+ "=");
                runPerOver[i][j] = s.nextInt();
                

            }
         }
         
         int totalRun=0;
         for(int i=0;i<3;i++){
            for(int j=0;j<6;j++){
                System.out.println(runPerOver[i][j]);
                totalRun+=runPerOver[i][j];
            }
         }
         double average =totalRun/(double) runPerOver.length;
         double a=double runPerOver.length
         System.out.println(a);
         System.out.println("total Run="+totalRun);
         System.out.println("average per over="+average);


    }
}