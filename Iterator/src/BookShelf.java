public class BookShelf implements Aggregate{
    private final Book[] books;
    private int index;

    public BookShelf(int maxSize) {
        books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        if (index >= this.getLength()) return null;
        return books[index];
    }

    public boolean appendBook(Book book) {
        if (index > this.getLength()) return false;
        books[index++] = book;
        return true;
    }

    public int getLength() {
        return index;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
