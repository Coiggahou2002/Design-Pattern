public class Test {
    public static void main(String[] args) {

        BookShelf myBookShelf = new BookShelf(10);

        myBookShelf.appendBook(new Book("Head First Java"));
        myBookShelf.appendBook(new Book("Biology of Tencent"));
        myBookShelf.appendBook(new Book("Coiggahou"));
        myBookShelf.appendBook(new Book("hahahha"));

        Iterator it = myBookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book);
        }
    }
}
