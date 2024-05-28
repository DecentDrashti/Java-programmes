import java.util.*;
import java.io.*;
public class File11{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String fileName=sc.nextLine();
        File f=new File(fileName);
        if(f.exists()){
            if(f.isFile()){
         System.out.println("file size="+f.length());
            }else{
                System.out.println("folder:");
                String[] fileNames=f.list();
                for(int i=0;i<fileNames.length;i++){
                    System.out.println(fileNames[i]);
                }
            }
        }else{
            System.out.println("dont exist");
        }
    }
}