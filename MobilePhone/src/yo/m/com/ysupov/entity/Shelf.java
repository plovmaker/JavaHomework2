package yo.m.com.ysupov.entity;

public abstract class Shelf implements Furniture, Size {
    boolean hasDoors;
    int legsCount;
    int shelfCount;



    public boolean openTheDoor() {
        return true;
    }

    public abstract void bookOnShelf(BookShelf.Book book);
}
