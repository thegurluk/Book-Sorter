public class Book implements Comparable<Book>{
    String bookName;
    int numberOfPage;
    String authorName;
    int yearOfPublication;

    public Book(String bookName,int numberOfPage,String authorName,int yearOfPublication){
        this.bookName=bookName;
        this.numberOfPage=numberOfPage;
        this.authorName=authorName;
        this.yearOfPublication=yearOfPublication;
    }

    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public int compareTo(Book o) {
        return getBookName().compareTo(o.getBookName());
    }
}
