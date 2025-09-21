public class Main {
    public static void main(String[] args) {
        System.out.println("Creating ebooks for students...\n");
        
        EBook student1 = new RealEBook("book1.txt");
        EBook student2 = new LazyEBook("book2.txt");
        EBook student3 = new LazyEBook("book3.txt");
        
        System.out.println("\nStudent 1 reads immediately:");
        student1.display();
        
        System.out.println("\nStudent 2 reads (lazy loading):");
        student2.display();
        student2.display();
        
        System.out.println("\nStudent 3 reads (lazy loading):");
        student3.display();
        student3.display();
    }
}
