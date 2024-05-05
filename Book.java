public class Book implements BorrowableBook{

    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Book: " + title);
    }
    
}