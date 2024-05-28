abstract class Vegetable{
    String name;
    String color;//abstract class ma method nakhu to e compulsory thay jay ke e to karvanuj che..
    Vegetable(String name,String color){ 
   this.name=name;
    this.color=color;
  }
  abstract void display();
}
class Potato extends Vegetable{
  Potato(String a,String b){
    super(a,b);
  }
}
  class Tomato extends Vegetable{
    Tomato(String a,String b){
      super(a,b)
    }
  }
  public void display(){
    System.out.println(name+" "+color);
  }

    
public class Veg_Demo{
    public static void main(String[] args){
        Potato p1=new Potato("potato","skin");
        p1.display();
        Tomato t1=new tomato("Tomato","red");
        t1.display();
    }
}