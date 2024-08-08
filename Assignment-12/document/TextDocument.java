package document;

public class TextDocument extends Document{
    TextDocument(String title){
        super(title);
    }
    void load() {
        System.out.println("Loading Text document: " + title);
    }
    void save() {
        System.out.println("Saving Text document: " + title);
    }
}
