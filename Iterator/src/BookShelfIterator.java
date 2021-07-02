

public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookshelf) {
        this.bookShelf = bookshelf;
    }

    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    /**
     * 返回迭代器当前指向的对象，然后将迭代器向前
     */
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index ++;
        return book;
    }
}
