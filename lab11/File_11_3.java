import java.io.*;
import java.util.*;
public class File_11_3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the file name");
        String s=sc.nextLine();
        lab_11_Thread l11t=new lab_11_Thread(s);
        l11t.start();
        for(int i=0;i<10000;i++){
            System.out.println("my main thread is running");
        }
    }
}
class lab_11_Thread extends Thread{
    String fileName;
      lab_11_Thread(String fileName){
        this.fileName=fileName;
     }
    public void run(){
        try{

            FileInputStream fis= new FileInputStream(fileName);
            int temp=fis.read();
            while(temp>=0){
               System.out.println(temp);
               temp=fis.read();

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
} 