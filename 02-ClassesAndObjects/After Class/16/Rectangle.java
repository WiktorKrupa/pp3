public class Rectangle {
    
    //list of atributes
    int x;
    int y;
    int perimeter;
    int surface;
    
    //list of methods
    public void calculatePerimeter()
    {
         int perimeter = 2*x + 2*y;
    }
    public void calculateSurface()
    {
        int surface = x*y;
    }
    public void displayInfo()
    {
        System.out.println("rectangle dimensions are : \n x= "+x +"\n y= "+y);
        System.out.println("Preimeter is: "+perimeter);
        System.out.println("Surface is: "+surface);     
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.x= 3;
        r1.y = 4;
        r2.x = 2;
        r2.y = 7;
        
        r1.calculatePerimeter();
        r2.calculatePerimeter();
        r1.calculateSurface();
        r2.calculateSurface();
        
        
        System.out.println("First Rectangle: ");
        r1.displayInfo();
        System.out.println("Second Rectangle: ");
        r2.displayInfo();
        
    }
    
    
}