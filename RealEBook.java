
public class RealEBook implements EBook {
    private final String fileName;
    
    public RealEBook(String fileName) {
        this.fileName = fileName;
        System.out.println("RealEBook created for: " + fileName);
    }
    
    @Override
    public void display() {
    }
}
