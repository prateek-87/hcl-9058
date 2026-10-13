package HCL_ASSESSMENT_2_CORE_JAVA_2300321530144_PRATEEK_KUMAR.AdminController;

public interface Admin {
    void addBook(int bookId, String bookName, int bookCount);
    void addMagazine(int bookId, String bookName, int bookCount);
    void register(int bookId, String StudentName);
    void deleteBook(int bookId);
    void assignBook(int bookId, int StudentId);

}
