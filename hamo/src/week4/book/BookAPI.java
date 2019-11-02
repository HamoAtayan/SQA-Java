package week4.book;

import java.util.Arrays;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class BookAPI {

    public static Book[] getAllBooks() {
        return BookRepository.getData();
    }

    public static Book[] getBooksOfGivenAuthor(Author author) {
        Book[] booksOfSpecificAuthor = new Book[10];
        Book[] books = getAllBooks();
        for (int i = 0; i < books.length; i++) {
            int j = 0;
            if (books[i].author.name.equals(author.name) && books[i] != null) {
                booksOfSpecificAuthor[j++] = books[i];
            }
        }
        return booksOfSpecificAuthor;
    }

    public static Book[] getTop3BooksOfGivenAuthor(Author author) {
        Book[] top3Books = new Book[3];
        Book[] books = getBooksOfGivenAuthor(author);
        Arrays.sort(books);
        int j = 0;
        for (int i = books.length -1; i >= 0; i++){
            if(books[i] != null){
                top3Books[j] = books[i];
                j++;
            }
            if(j == 4){return top3Books;}
        }

        return top3Books;
    }



}
