public class BookProcessor {
    private StudentBook studentBook;
    private BorrowableBook borrowable;

    public BookProcessor(StudentBook studentBook, BorrowableBook borrowable) {
        this.studentBook = studentBook;
        this.borrowable = borrowable;
    }

    public void process () {
        borrowable.borrow(studentBook.getTitle());
    }

}