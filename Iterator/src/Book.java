public class Book {
    private String name;

    public Book(String name) {
        if (name == null) System.out.println("Name of the book required!");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
