package Week_4;

import java.util.Arrays;

/**
 * Created by Vane Gharakhanian on Nov, 2019
 */
public class Main {
    public static void main(String[] args) {
        Book[] books = BookRepository.getData();
        System.out.println(Arrays.toString(books));
        System.out.println();
        System.out.println(Arrays.toString(Api.getBooksOfAuthor(books, "J.K. Rowling")));
    }
}
