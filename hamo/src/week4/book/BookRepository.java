package week4.book;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class BookRepository {

    static Author[] authors = AuthorRepository.getData();

    static String[] names = {"Sasna Crer", "Alice in wonderland", "Red hat", "Harry Potter", "Gevorg Marzpetuni", "Qaj Hamon", "Avel qaj Hamon", "Amenaqaj Hamon"};

    public static Book[] getData() {

        Book[] books = new Book[10];
        for (int i = 0; i < books.length; i++) {
            Book book = new Book();
            book.name = names[(int) (Math.random() * 8)];
            book.author = authors[(int) (Math.random() * 8)];
            books[i] = book;
        }

        return books;
    }

}
