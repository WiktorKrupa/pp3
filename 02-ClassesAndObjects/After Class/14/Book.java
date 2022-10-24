public class Book {
    
    //list of atributes
    String title;
    int pages;
    boolean isOpen;
    boolean inLibrary;
    
    //list of methods
    public void displayName()
    {
        System.out.println(title);
    };
    public void numPages()
    {
        System.out.println(pages);
    };
    public void changeStatus1()
    {
        isOpen =!isOpen;
    };
    public void changeStatus2(){
        inLibrary =!inLibrary;
    };
    public void showStatus(){
        System.out.println(isOpen);
        System.out.println(inLibrary);
    }
    
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Smok";
        b1.pages = 200;
        b1.isOpen = false;
        b1.inLibrary = true;
        
        b1.displayName();
        b1.numPages();
        b1.showStatus();
        b1.changeStatus1();
        b1.changeStatus2();
        b1.showStatus();
        
    };
    
}
