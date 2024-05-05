public class TestProgram {
    public static void main(String[] args) {
        
        StudentBook stud1 = new StudentBook("123", "Cruz", 
                                            "Isaiah", "Physics Book");
        BookProcessor process1 = new BookProcessor(stud1, new Book());
        process1.process();

        StudentBook stud2 = new StudentBook("456", "Perez", 
                                            "Ruby", "Advanced Mathematics Journal");
        BookProcessor process2 = new BookProcessor(stud2, new Journal());
        process2.process();
    }
}