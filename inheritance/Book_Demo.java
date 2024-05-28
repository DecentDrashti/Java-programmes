public class Book_Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the publication");
    String p=sc.next();
    if(p.equals("book")){
        b=new book_publication("Title","Author-name");
    }
    else{
        b=new paper_publication("Title","Author-name");
    }
    }
}
class book{
 private String author_name;
 
 book(String an){
    this.author_name=an;
   }
public void display(){
    System.out.println(author_name);
   }
}
class book_publication extends book{
 private String Title;
 book_publication(String an,String Title){
  super(an);
  this.Title=Tt;
 }
 public void display(){
    super.display();
    System.out.println("Title="+this.Title);
 }
}
class paper_publication extends book{
 private String Title;
 paper_publication(String an,String Title){
  super(an);
  this.Title=Tt;
 }
 public void display(){
    super.display();
    System.out.println("Title="+this.Title);
 }
}