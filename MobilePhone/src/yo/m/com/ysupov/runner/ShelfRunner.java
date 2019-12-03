package yo.m.com.ysupov.runner;
import yo.m.com.ysupov.entity.BookShelf;

import yo.m.com.ysupov.entity.*;

import java.awt.print.Book;

public class ShelfRunner {
    public static void main(String[] args) {
        BookShelf bookShelf1 = new BookShelf();
        System.out.println(bookShelf1.toString());
        BookShelf.Book a = new BookShelf.Book("Lord Of The Rings", "Tolkien", 315);
        a.toString();
        bookShelf1.bookOnShelf(a);
        BookShelf.Action c = new BookShelf().new Action();
        c.bookOnShelf();
    }


}