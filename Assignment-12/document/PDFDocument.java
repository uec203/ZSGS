package document;

public class PDFDocument extends Document {
    PDFDocument(String title){
        super(title);
    }
    void load() {
        System.out.println("Loading PDF document: " + title);
    }
    void save() {
        System.out.println("Saving PDF document: " + title);
    }
}
