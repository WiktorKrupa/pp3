public class surfaceArea {
    

    
    public static double areaCircle(int radius){
        return 3.14*(radius*radius);
        
        
    }
    
    
    public static double areaRect(int recX, int recY){
        return recX*recY;
    }
    
    
    public static double areaTri(int triBase, int triHeight)
    {
        return 0.5*triBase*triHeight;
    }

    public static void main (String[] args) {
        
        double areaRectangle = areaRect(4,5);
        double areaCircle = areaCircle(3);
        double areaTriangle = areaTri(3,4);
        
        System.out.println(areaRectangle);
        System.out.println(areaCircle);
        System.out.println(areaTriangle);
        
        
    }
    
    
}
