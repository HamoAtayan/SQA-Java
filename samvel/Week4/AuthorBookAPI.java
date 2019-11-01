import java.time.LocalDate;

public class AuthorBookAPI {

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }

    public static Author[] getAuthors(int length) {
        Author[] authors = new Author[length];
        for (int i=0; i<length; i++) {
            Author author = new Author();
            author.setAuthor(DataLibrary.names[(int)(Math.random()*4)], DataLibrary.surnames[(int)(Math.random()*4)], (int)(Math.random()*100));
        }
        return authors;
    }

    public static Book[] getBooks(int length) {

        Book[] books = new Book[length];
        Author[] authors = AuthorBookAPI.getAuthors(6);
        for (int i=0; i<length; i++) {
            Book book = new Book();
            book.setBook(DataLibrary.titles[(int)(Math.random()*4)], authors[i], Math.random()*10, createRandomDate(1900, 2000));
        }
        return books;
    }

    public static Book[] getGivenAuthorsBooks(Author author) {
        Book[] allBooks = getBooks(6);
        Book[] givenBooks = new Book[6];
        int j=0;
        for (int i=0; i<allBooks.length; i++) {
            if (allBooks[i].getBookAuthor().toString().equals(author.toString())) {
                givenBooks[j] = allBooks[i];
                j++;
            }
        }
        return givenBooks;
    }
}
