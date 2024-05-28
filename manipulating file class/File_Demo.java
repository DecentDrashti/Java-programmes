import java.io.*;
import java.util.Scanner;
public class File_Demo{
    public static void main(String[]args){
        // Scanner sc=new Scanner(System.in);
        int lineCount=0,charCount=0,wordCount=0;        
        try{
            // int i=0;
            File file=new File("D.txt");//File ni jagya e bufferreader br
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                //while(line=br.readline()!=null)
                String line =sc.nextLine();
                lineCount++;
              
                
                for(int i=0;i<line.length();i++){
                if(line.charAt(i)!=' '){
                charCount ++;
                // charCount++
                
                }
                // i++;
                }
                 String arr[]=line.split(" ");
                wordCount+=arr.length;

            }
            System.out.println(lineCount);
            System.out.println(charCount);
             System.out.println(wordCount);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}