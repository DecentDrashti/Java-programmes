import java.util.*;
import java.util.Scanner;
class Time{
  int hour;
  int min;
  int sec;
    Time(){
    this.hour=5;
    this.min=45;
    this.sec=24;
 }
 Time(int hour,int min,int sec){
  this.hour=hour;
  this.min=min;
  this.sec=sec;

 }
 void add(Time t){
  int h=this.hour+t.hour;//t.hour ma this.hour=hour jase h1+hour
  int m=this.min+t.min;
  int s=this.sec+t.sec;
  if(s>=60){
    s=s-60;
    m++;
  }
  if(m>=60){
    m=m-60;
    h++;
  }
System.out.println(h+":"+m+":"+s);//totaltime print karave che
 }
}
public class Add{
    public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
      System.out.print("enter the time t1 in hrs:min:sec t1=")
      Time t1=new Time();
       System.out.print("enter the time t2 in hrs:min:sec t2=");
      int hour=sc.nextInt();
      int min=sc.nextInt();
      int sec=sc.nextInt();
      Time t2=new Time(hour,min,sec);
      t1.add(t2);
      // System.out.println(totaltime);
    }
}