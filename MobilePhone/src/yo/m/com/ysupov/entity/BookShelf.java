package yo.m.com.ysupov.entity;

public class BookShelf extends Shelf {
    private int bookCapacity;
    private int bookCount;
    private int weightCapacity;
    private String material;
    private int height;
    private int width;
    private int length;

    public BookShelf() {

    }

    public BookShelf(int bookCapacity, int weightCapacity, String material, int height, int width, int length) {
        this.bookCapacity = bookCapacity;
        this.weightCapacity = weightCapacity;
        this.material = material;
        this.height = height;
        this.width = width;
        this.length = length;

    }

    @Override
    public int getCapacity() {
        return bookCapacity;
    }
    public void setCapacity(int bookCapacity) {
        this.bookCapacity = bookCapacity;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }
    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    @Override
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean openTheDoor() {
        throw new UnsupportedOperationException("There are no doors");
    }

    @Override
    public String toString() {
        return "I'm a book shelf";
    }

    @Override
    public int getSize() {
        return height*width*length;
    }
    public void setSize(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public void bookOnShelf(Book book) {
        System.out.println("Book: " + book.toString() + " is on a shelf");
    }

    public int getBookCount() {
        return bookCount;
    }
    public void setBookCount(int n) {
        this.bookCount = n;
    }



    public static class Book extends BookShelf implements Size {
        String title;
        String author;
        int pageCount;
        boolean onShelf;


        public String getTitle() {
            return title;
        }
        public String toString() {
            return "hey";
        }
        public Book(String title, String author, int pageCount) {
            this.onShelf = false;
            this.title = title;
            this.author = author;
            this.pageCount = pageCount;

            System.out.println("Book " + this.toString() + " is created");

        }
        @Override
        public void bookOnShelf(Book book) {
            super.bookOnShelf(book);
        }

        @Override
        public int getSize() {
            return 0;
        }


    }

    public class Action extends BookShelf  {
        public void bookOnShelf() {
            System.out.println("Something on a bookShelf");
        }
    }
}
