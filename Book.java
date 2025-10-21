public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author,String ibsn)
    {
        this.title=title;
        this.author=author;
        this.isbn=ibsn;
    }

    public String getTitle()
    {
        return this.title;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public String getIsbn()
    {
        return this.isbn;
    }

    public void setTitle(String title)
    {
        if(!title.isEmpty())
        {
            this.title=title;
        }
        else {
            System.out.println("You must give your book a title !");
        }
    }
    public void setAuthor(String author)
    {
        if(!author.isEmpty())
        {
            this.author=author;
        }
        else {
            System.out.println("You must give your book an author !");
        }
    }
    public void setIsbn(String isbn)
    {
        if(!isbn.isEmpty())
        {
            this.isbn=isbn;
        }
        else {
            System.out.println("You must give your book an isbn !");
        }
    }
    @Override
    public String toString()
    {
        return " Type : Book \n Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}
