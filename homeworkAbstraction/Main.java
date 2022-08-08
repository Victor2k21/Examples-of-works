package homeworkAbstraction;

public class Main {
    public static void main(String[] args) {
        SupplierReader supplierReader = new SupplierReader( "Anna");
        LibrarianAdmin librarianAdmin = new LibrarianAdmin("Alex");
        SupplierReader supplierReader1 = new SupplierReader( "Ivan");
        supplierReader.takeBook(librarianAdmin);
        librarianAdmin.orderBook(supplierReader);
        supplierReader.bringBook(librarianAdmin);
        librarianAdmin.overdueNotification(supplierReader1);
        supplierReader.returnBook(librarianAdmin);
    }
}
