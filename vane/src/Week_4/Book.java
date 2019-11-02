package Week_4;

import java.util.Date;

/**
 * Created by Vane Gharakhanian on Nov, 2019
 */
public class Book {
    private String title;
    private String author;
    private int pages;
    private Date releaseDate;


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setPages() {
        pages = (int) (Math.random() * 1000);
    }

    public int getPages() {
        return pages;
    }

    public Date getReleaseDate() {
        this.releaseDate = new java.util.Date();
        return releaseDate;
    }

    public String toString() {
        return String.format("{title: %s, author:%s, pages: %d, release date:%s}", title, author, pages, releaseDate);
    }

}
