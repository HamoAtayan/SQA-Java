package week4.book;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class AuthorAPI {

    public Author[] getAllBooks(){
        return AuthorRepository.getData();
    }

}
