package homeworkAbstraction;

public class SupplierReader extends User implements Supplier, Reader {

    public SupplierReader(String name) {
        super(name);
    }
    public void takeBook(Librarian librarian) {
        System.out.println("Читатель " + getName() + " берет книгу у библиотекаря " + librarian);
    }
    public void returnBook(Librarian librarian) {
        System.out.println("Читатель " + getName() + " вернул книгу библиотекарю " + librarian);
    }
    public void bringBook(Administrator administrator) {
        System.out.println("Поставщик " + getName() + " привез книги администатору " + administrator);
    }
}
