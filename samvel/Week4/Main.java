
public class Main {
    public static void main(String[] args) {

        Author[] authors = AuthorBookAPI.getAuthors(6);
        Author.authorArrayToString(authors);

        Book[] books = AuthorBookAPI.getBooks(6);
        Book.bookArrayToString(books);

        System.out.println("");
        Book.bookArrayToString(AuthorBookAPI.getGivenAuthorsBooks(authors[2]));
        B b = new B("Samvel");
//        A a = new B("Ani");
//        A c = new A();
//        B b1 = new B();
//        A b2 = new B();
        Helper h = new Helper();
        Person p = new Person("aaa");
        h.change(p);
        System.out.println(p.getName());
    }
}
