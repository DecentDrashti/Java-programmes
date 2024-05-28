import java.util.*;
public class Student_Demo{
    public static void main(String []args){
        int n;
    System.out.println("enter the number of student");
      n=Integer.parseInt(args[0]);
         Student []stu = new Student[n];
       for(int i=0;i<n;i++){
           stu[i]= new Student();
       }
       for(int i=0;i<n;i++){
        stu[i].Spi();
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
    double spi;
    int [] s=new int[no_of_subj];

    
    Student(){
        Scanner sc=new Scanner(System.in);
        
        // int student[]=student[stu_no];
        
        System.out.println("enter the student id number");
        id_no=sc.nextInt();
        System.out.println("enter the no of subject");
        no_of_subj=sc.nextInt();
        System.out.println("enter the subject code ,credit,grade for the subject");

        for(int j=1;j<=no_of_subj;j++){
        sub_code[j]=sc.nextInt();
        sub_credit[j]=sc.nextInt();
        grade_obtained[j]=sc.next();
        }
    }
        public void spi(){
         System.out.println("to calculate spi");
            int sum=0;
            int s=0;
            for(int j=1;j<=no_of_subj;j++){
                if(grade_obtained.equals("A+")){
                  sum+=sub_credit[j]*10;
                }
               else if(grade_obtained.equals("A")){
                  sum+=sub_credit[j]*9;
                } 
               else if(grade_obtained.equals("B+")){
                  sum+=sub_credit[j]*8;
                }
               else if(grade_obtained.equals("B")){
                  sum+=sub_credit[j]*7;
                } 
                else if(grade_obtained.equals("C+")){
                  sum+=sub_credit[j]*6;
                }
                else if(grade_obtained.equals("C")){
                  sum+=sub_credit[j]*5;
                }
                s+=sub_credit[j];
            
         }
         int ans= sum/s;
         System.out.println(ans);
        }
    }

