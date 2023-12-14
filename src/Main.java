import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1=new Book("Sefiller",400,"Victor Hugo",2001);
        Book book2=new Book("kaşağı",150,"ömer seyfettin",1988);
        Book book3=new Book("Abasıyanık",650,"Sait faik",2008);
        Book book4=new Book("sonbahar",250,"salih mert",2017);
        Book book5=new Book("sherlock holmes",270,"Arthur conan",1871);

        TreeSet<Book> books=new TreeSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book bk:books){
            System.out.println("Book name:"+bk.getBookName()+"|| Author Name:"+bk.getAuthorName()+"|| Number Of Page:"+bk.getNumberOfPage()+"|| Publication year:"+bk.getYearOfPublication());

        }
        System.out.println("----------------------------------------");

        TreeSet<Book> books1=new TreeSet<>(
                new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o2.getNumberOfPage()-o1.getNumberOfPage();
                    }
                }
        );
        books1.add(book1);
        books1.add(book2);
        books1.add(book3);
        books1.add(book4);
        books1.add(book5);

        for (Book bk:books1){
            System.out.println("Book name:"+bk.getBookName()+"|| Author Name:"+bk.getAuthorName()+"|| Number Of Page:"+bk.getNumberOfPage()+"|| Publication year:"+bk.getYearOfPublication());

        }



    }
}