public class Book {
    static int totalBooks;
    String title, author, isbn;
    boolean isBorrowed;
    
    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
    }

    public static int getTotalBooks(){
        return(totalBooks);
    }

    void borrowBook(){
        if(isBorrowed) {
            System.out.println("Book is Already Borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy Reading");
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope You Enjoyed. Leave a review");
        } else {
            System.out.println("Book is NOT Borrowed");
        }
    }

    public static void main(String[] args) {
        Book ob1 = new Book("BGMI", "Prashant", "69");
        Book ob2 = new Book("96");
        System.out.println(Book.totalBooks);
        ob1.borrowBook();
        ob2.borrowBook();
        ob1.borrowBook();
        ob2.returnBook();
        ob2.returnBook();

    }
}
