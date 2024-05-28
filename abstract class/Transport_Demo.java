interface Transport{
    void deliver();

}
abstract class Animal{
  void eating();
}
class Tiger extends Animal{
   public void eating(){
    System.out.println("I am Tiger I am carnivores animal");
   }
}
class Camel implements Transport extends Animal{
public void eating(){
    System.out.println("I am Camel I am herbivores animal love to drink water and store it");
}
public void deliver(){
    System.out.println("I am Camel I can deliver one calf ");
}
}
class Deer extends Animal{
public void eating(){
    System.out.println("I am Deer I am Herbivores animal");
   }
}
class Donkey implements Transport extends Animal{
    public void eating(){
    System.out.println("I am Donkey I am herbivores animal known for my knowledge");
   }
public void deliver(){
    System.out.println("I am Camel I can deliver one foal ");
}
}
class Transport_Demo {
  public static void main(String[] args) {
    Camel myCamel = new Camel();  // Create an object
    myCamel.eating();
    myCamel.deliver();
  }
}