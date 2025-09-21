
public class LazyEBook implements EBook{
    private final String fileName;
    private String content;
    private boolean loaded=false;
    
    public LazyEBook(String fileName){
        this.fileName=fileName;
        System.out.println("LazyEBook(not loaded yet): "+ fileName);
    }
    
    @Override
    public void display() {
        if (!loaded) {
            System.out.println("Loading " + fileName + " for the first time...");
        }
        System.out.println("Content: " + content.substring(0, Math.min(50, content.length())) + "...");
    }
}