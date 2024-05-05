public class Journal implements BorrowableBook{

    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Journal: " + title);
    }

}