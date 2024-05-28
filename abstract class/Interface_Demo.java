  // parent interface hoi ne child class hoi to implements use karvanu else extends
    interface A{
        final int a=10;
        void mA();

    }
    interface A1 extends A{
        final int a1=20;
        void mA1();
    }
    interface A2 extends A{
        final int a2=15;
       void mA2();
    }
    interface A12 extends A1,A2{
        final int a12=5;
        void mA12();
    }

    class B implements A12{
      public void mA(){
            System.out.println(a);
      }
      public void mA1(){
            System.out.println(a1);
      }
      public void mA2(){
            System.out.println(a2);
      }
      public void mA12(){
            System.out.println(a12);
      }
    }
    public class Interface_Demo{
         public static void main(String[]args){
         B My_obj =new B();
         My_obj.mA();
         My_obj.mA1();
         My_obj.mA2();
         My_obj.mA12();
    }
}

