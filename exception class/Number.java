//raise and handle the exception.
class Negative extends Exception{
    Negative(String str){
        super(str); // parameterized constructor ma pass karu chhu call nathi karti so bracket 
    }
}
class Byten extends Exception{
    Byten(String str){
        super(str);
    }
}
public class Number{
    public static void main(String[]args){
         Number a=new Number();
        try{
        int x=Integer.parseInt(args[0]);
        // System.out.println(ans);
        if(x<0){
            throw new Negative("negative Integer");
        }else if(x%10==0){
            throw new Byten("evenly divisible by 10");
        }
        // else if(x>1000 && x<2000){
        //     throw Exception("greater than 1000 and less than 2000");
        // }else if(x>7000){
        //     throw Exception("greater than 7000");
        // }
        }
        catch(Exception e){
            System.out.println(e);
        }
     
    }
}
//command line thi karavo git gui karta
