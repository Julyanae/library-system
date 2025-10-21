import java.util.ArrayList;

public class Library {

        private ArrayList <Book> myBooks ;

        public Library()
        {
            this.myBooks= new ArrayList<>();
        }

        public void addBook(Book book)
        {
            myBooks.add(book);
        }

        public ArrayList<Book> getMyBook()
        {
            return this.myBooks;
        }

}
