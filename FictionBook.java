public class FictionBook extends Book{

    public FictionBook(String title, String author, String isbn)
    {
        super(title,author,isbn);
    }
    @Override
    public String toString()
    {
        return " Type : FictionBook \n Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", ISBN: " + this.getIsbn();
    }

}
