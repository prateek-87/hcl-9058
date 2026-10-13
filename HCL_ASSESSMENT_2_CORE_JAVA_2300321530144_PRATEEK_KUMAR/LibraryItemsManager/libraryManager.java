package HCL_ASSESSMENT_2_CORE_JAVA_2300321530144_PRATEEK_KUMAR.LibraryItemsManager;

import HCL_ASSESSMENT_2_CORE_JAVA_2300321530144_PRATEEK_KUMAR.AdminController.Admin;
import HCL_ASSESSMENT_2_CORE_JAVA_2300321530144_PRATEEK_KUMAR.LibraryItems.books;
import HCL_ASSESSMENT_2_CORE_JAVA_2300321530144_PRATEEK_KUMAR.LibraryItems.dvd;
import HCL_ASSESSMENT_2_CORE_JAVA_2300321530144_PRATEEK_KUMAR.LibraryItems.magazine;

import java.util.ArrayList;
import java.util.List;
public class libraryManager implements Admin {
    HashMap<Integer, books> booksList = new HashMap<>();
    List<dvd> dvdList = new ArrayList<>();
    List<magazine> magazineList = new ArrayList<>();

    @override
    public void addBook(int bookId, String bookName, int countOfBooks){
        books book = new books();
        @override
        public void setBookName(String bookName){
            super.setBookName(bookName){
            }
        }

        @override
        public void setBookId(int bookId){
            super.setBookId(bookId);
        }
        @override
        public void setCountOfBooks(int countOfBooks){
            super.setCountOfBooks(countOfBooks);
        }
    }

    @Override
    public void addMagazine(int bookId, String magazineName, int magazineCount) {

    }

    @Override
    public void register(int bookId, String StudentName) {

    }

    @Override
    public void deleteBook(int bookId) {
        if(booksList.containsKey(bookId)){
            Books b = booksList.get(booksId);
            b.setCountOfBooks(b.getCountOfBooks()-1);

        }
    }

    @Override
    public void assignBook(int bookId, int StudentId) {

    }
}
