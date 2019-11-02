package Week_4;

/**
 * Created by Vane Gharakhanian on Nov, 2019
 */
public class Api {
    public static Book[] getBooksOfAuthor(Book[] books, String author) {
        Book[] authorBooks = new Book[getLength(books, author)];
        int i = 0;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                authorBooks[i] = book;
                i++;
            }
        }
        return authorBooks;
    }

    public static int getLength(Book[] books, String author) {
        int length = 0;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                length++;
            }
        }
        return length;
    }
}
