package document;

class Main{
    public static void main(String[] args) {
        Document pdf= new PDFDocument("PDFFile");
        Document text = new TextDocument("TextFile");
        Document image = new ImageDocument("ImageFile");

        pdf.load();
        pdf.save();
        pdf.printTitle();
        text.load();
        text.save();
        text.printTitle();
        image.load();
        image.save();
        image.printTitle();
    }
}
