public class MyLibrary {

    public static void main(String[] args) {

        Library library = new Library();
        Book book1=new Book("1984","George Orwell","9780451524935");
        Book book2=new FictionBook("Sapiens: A Brief History of Humankind","Yuval Noah Harari","9780062316097");
        Book book3=new NonFinctionBook("To Kill a Mockingbird","Harper Lee","9780061120084");

        library.addBook(book1); library.addBook(book2); library.addBook(book3);

        for(Book book : library.getMyBook())
        {

            System.out.println(book.toString());
            System.out.println("\n*******************************************\n");
        }
    }


}
