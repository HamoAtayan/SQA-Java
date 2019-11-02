package Week_4;

/**
 * Created by Vane Gharakhanian on Nov, 2019
 */
public class BookRepository {
    private static String[] autors = {"J.K. Rowling", "Alexandre Dumas", "William Shakespeare"};
    private static String[] rowlingBooks = {"Fantastic Beasts And Where To Find Them", "Harry Potter and the Deathly Hallows"};
    private static String[] dumasBooks = {"Three Musketeers", "Count Of Monte Cristo"};
    private static String[] shakespeareBooks = {"Romeo and Juliette", "Macbeth", "Hamlet"};

    private static Book[] getRowlingBooks() {
        Book[] books = new Book[rowlingBooks.length];

        for (int i = 0; i < rowlingBooks.length; i++) {
            Book rowlingBook = new Book();
            rowlingBook.setAuthor(autors[0]);
            rowlingBook.setTitle(rowlingBooks[i]);
            rowlingBook.setPages();
            books[i] = rowlingBook;
        }
        return books;
    }

    private static Book[] getDumasBooks() {
        Book[] books = new Book[dumasBooks.length];
        for (int i = 0; i < dumasBooks.length; i++) {
            Book book = new Book();
            book.setAuthor(autors[1]);
            book.setTitle(dumasBooks[i]);
            book.setPages();
            books[i] = book;
        }
        return books;
    }

    private static Book[] getShakespearBooks() {
        Book[] books = new Book[shakespeareBooks.length];
        for (int i = 0; i < shakespeareBooks.length; i++) {
            Book book = new Book();
            book.setAuthor(autors[2]);
            book.setTitle(shakespeareBooks[i]);
            book.setPages();
            books[i] = book;
        }
        return books;
    }

    public static Book[] getData() {
        int booksCount = rowlingBooks.length + dumasBooks.length + shakespeareBooks.length;
        Book[] books = new Book[booksCount];
        getRowlingBooks();
        getDumasBooks();
        getShakespearBooks();
        int i = 0;
        for (Book book : getRowlingBooks()) {
            books[i] = book;
            i++;
        }
        for (Book book: getShakespearBooks()) {
            books[i] = book;
            i++;
        }
        for (Book book: getDumasBooks()) {
            books[i] = book;
            i++;
        }
        return books;
    }
}
