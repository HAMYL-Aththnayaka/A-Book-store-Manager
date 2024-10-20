public class Book {

   private String title;
   private double price;
   private int pages;
   private Author author;
   
   
    Book(String title,double price,int pages,Author author){
        this.title=title;
        this.price=price;
        this.pages=pages;
        this.author=author;
    }

    public Author getAuthor(){
        return author;
}
    public int getPages(){
        return pages;
}
    public double getPrice(){
        return price;
}
public void setPrice(double price){
    this.price=price;
}

public void bookDetails(){
    System.out.println(title);
    System.out.println("Prce = "+price);
    System.out.println(pages);
    System.out.println(author.getname());
}


}
