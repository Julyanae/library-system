public class NonFinctionBook extends Book{

    public NonFinctionBook(String title, String author, String isbn)
    {
        super(title,author,isbn);
    }

    @Override
    public String toString()
    {
        return " Type : NonFictionBook \n Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", ISBN: " + this.getIsbn();
    }
}
