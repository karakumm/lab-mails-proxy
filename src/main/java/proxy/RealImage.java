package proxy;


public class RealImage implements Image {
    private String fileName;

    public RealImage(String filename) {
        this.fileName = filename;
        loadFromDisk();
    }
    @Override
    public void display() {
        System.out.println("Image displayed");
    }
    public void loadFromDisk() {
        System.out.println("Image has been loaded from disk");
    }
}
