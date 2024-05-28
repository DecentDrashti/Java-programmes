import java.util.*;
public class Bank_Account{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
    //    Account person1=new Account();
        System.out.println("enter username");
       String userName=sc.next(); 

        System.out.println("enter account number");
       int accountNo=sc.nextInt();

        System.out.println("enter email");
       String email=sc.next();

       System.out.println("enter account balance");
       int accountBalance=sc.nextInt();

        System.out.println("enter account type");
       String accountType=sc.next();
        
       Account.getAccountDetails(userName,accountNo,email,accountBalance,accountType);
       Account.displayDetail();
    }
}
class Account{
     static String userName;
     static int accountNo;
     static String email;
     static int accountBalance;
     static String accountType;
     static void getAccountDetails(String Name, int aNo, String e, int aBalance, String aType){
        userName = Name;//obj banavu tyare static kadhi nakhvanu ne this dot karvanu
        accountNo=aNo;
        email=e;
        accountBalance=aBalance;
        accountType=aType;
    }
    static void displayDetail(){
        System.out.println(userName);
        System.out.println(accountNo);
        System.out.println(email);
        System.out.println(accountBalance);
        System.out.println(accountType);

    }
}