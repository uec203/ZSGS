package document;

abstract public class Document {
    protected String title;
    public Document(String title){
        this.title=title;
    }
    abstract void load();
    abstract void save();
    public String getTitle(){
        return title;
    }
    public void printTitle(){
        System.out.println("Document Title: "+title);
    }
}
