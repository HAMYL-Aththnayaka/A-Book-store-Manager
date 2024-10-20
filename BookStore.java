public class BookStore {
    public static void main(String args[]){
        Author author1 = new Author("D.R. David",'M',40);
        Author author2 = new Author("K.N.Irfhan", 'M' ,45);
        Author author3 = new Author("T.K.M.Kumari", 'F' ,36);
        Author author4 = new Author("S.Y.Nimali",'F',32);
        Author author5 = new Author("L.Ramanan" ,'M',30);

        Book book1 =new Book( "Introduction to Java" ,2000.00 ,340, author2);
        Book book2 =new Book("Object-Oriented Design", 2500.00 ,500, author4);
        Book book3 =new Book("Java for Beginners", 1800.00 ,300, author1);
        Book book4 =new Book("Introduction to C", 1500.00 ,250 ,author5);
        Book book5 =new Book("Java Script for Beginners", 1700.00 ,550,author3);

        System.out.println();
        System.out.println("List or display the details of all books including author’s details.");

        System.out.println();
        book1.bookDetails();
        System.out.println();
    
        book2.bookDetails();
        System.out.println();

        book3.bookDetails();
        System.out.println();

        book4.bookDetails();
        System.out.println();

        book5.bookDetails();
        System.out.println();


         System.out.println("List or display the details of all books which are written by female authors.");
         Book[] books={book1,book2,book3,book4,book5};
         for(Book a:books){
            if(a.getAuthor().getSex()=='F'){
                    a.bookDetails();
                System.out.println();
            }
        }

            System.out.println(" List or display the details of all books which are written by youngest author.");
            Author[] author={author1,author2,author3,author4,author5};
            int temp =author1.getAge();
                for (Author z:author){
                    if(z.getAge() > temp)
                   temp=z.getAge();
                }
            for(Book z: books){
                if(temp ==z.getAuthor().getAge()) {
                    z.bookDetails();
                    System.out.println();
                }
            }  System.out.println();
            System.out.println("Increase each book’s price with following conditions:- \nif the number of pages is < 500 increase the price by 20% \n- else increase the price by 10%.");

System.out.println("Price of all th books");
                for(Book z: books){
                    if(z.getPages() > 500){
                      z.setPrice(z.getPrice() +((z.getPrice())*20)/100);
                    }
                    else{
                            z.setPrice(z.getPrice() +((z .getPrice())*10)/100);
                    }
                
                
                }
                book1.bookDetails();
                System.out.println();
                book2.bookDetails();
                System.out.println();
                book3.bookDetails();
                System.out.println();
                book4.bookDetails();
                System.out.println();
                book5.bookDetails();
                System.out.println();
         }
          
        
    }

