class Odd implements Runnable{
    public void run(){
    	try{
    		
    	for(int n=1;n<20;n++){
            if(n%2!=0){
    		System.out.println(n);
            }
    		Thread.sleep(1000);
    		// n++;
    	}
    	}
    	catch(Exception e){
    		 e.printStackTrace();
    	}
    }
}
class Even implements Runnable{// implement ni  jagya extends hoi to runnable ni jagya e threads to niche @Override lakhvanu so kai spelling na lidhe error hoi to ave 
    public void run(){
    	try{
    		
    	for(int n=1;n<=20;n++){
            if(n%2==0){
    		System.out.println(n);
            }
    		Thread.sleep(3000);
    		// n=n+2;
    	}
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
public class Integer{
	public static void main(String [] args){
    
    Odd a1 = new Odd();
    Even a2 = new Even();

    Thread t1=new Thread(a1);
    t1.start();
    Thread t2=new Thread(a2);
    t2.start();
	}
}