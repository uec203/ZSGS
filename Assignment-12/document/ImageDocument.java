package document;

public class ImageDocument extends Document {
    ImageDocument(String title){
        super(title);
    }
    void load() {
        System.out.println("Loading Image document: " + title);
    }
    void save() {
        System.out.println("Saving Image document: " + title);
    }
}
