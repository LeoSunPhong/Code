package bookauthor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Book {

    private String BookID;
    private String title;
    private Author author;
    private Date dateOfBirth;

    public Book() {
    }

    public Book(String BookID, String title, Author author) {
        this.BookID = BookID;
        this.title = title;
        this.author = author;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    Book enterInfor(Book book) {
        Scanner scanner = new Scanner(System.in);
        Author author = new Author();

        System.out.print("enter name of book:  ");
        this.title = scanner.nextLine();

        System.out.print("enter name author: ");
        author.setName(scanner.nextLine());

        System.out.print("enter authorID: ");
        author.setAuthorID(scanner.nextLine());

        System.out.print("date of birth of author:  ");
        String date1 = scanner.nextLine();
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.dateOfBirth = date2.parse(date1);
        } catch (ParseException e) {

            System.out.println("error");
        }
        System.exit(0);
        this.author = author;

        System.out.print("enter bookID: ");
        this.BookID = scanner.nextLine();
        return null;
    }

    @Override
    public String toString() {
        return "Book{" + "BookID=" + BookID + ", title=" + title + ", author=" + author + '}';
       
        
    }

}
