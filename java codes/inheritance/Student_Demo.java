import java.util.*;
public class Student_Demo{
    public static void main(String []args){
      System.out.println("enter the number of student");
        int n =Integer.parseInt(args[0]);
         Student [] stu = newStudent[n];
       for(int i=1;i<=n;i++){
           stu[i]=new Student();
       }
    }
}
class Student{
    // int[] student;
    // int  stu_no;
    int id_no;
    int no_of_subj;
    int[] sub_code;
    int[] sub_credit;
    String[] grade_obtained;
    
    Student(){
        // int student[]=student[stu_no];
        
        System.out.println("enter the student id number");
        id_no.=sc.nextInt();
        System.out.println("enter the no of subject");
        no_of_subj=sc.nextInt();
        for(int j=1;j<=no_of_subj;j++){
        System.out,println("enter the subject code for the subject")
        sub_code[]=sc.nextInt[j];
        System.out.println("enter the subject credit for the subject");
        sub_credit[]=sc.nextInt[j];
        System.out.println("enter the subject grade");
        grade_obtained[]=sc.next[j];
        
        }
    }
}