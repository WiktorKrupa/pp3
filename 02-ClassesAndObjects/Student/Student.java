public class Student {
    
    //wykaz atrybutów
    String name;
    int age;
    String idCard;
    boolean cardValid;
    int semesterNumber;
    double averageGrade;
    
    
    //wykaz metod
    public void sayHello()
    {
        System.out.println("Hello");  
    };
    public void displayName()
    {
        System.out.println("My name is "+name); 
    };
    public void displayAge()
    {
        System.out.println("My age is "+age);
    };
    public void displayInfo()
    {
        System.out.println("Student's name is "+name);
        System.out.println("Student's semester number is "+semesterNumber);
        System.out.println("Student's average grade is "+ averageGrade);
    };
    public void changeIdStatus()
    {
        cardValid = !cardValid;
    };
    public void displayIdInfo()
    {
        System.out.println("Student's name is "+name);
        System.out.println("Student's Id card number  is "+ idCard);
        System.out.println("Is Student's Id card valid?: " +cardValid);
    };
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Wiktor";
        s1.age = 19;
        s1.idCard = "221422";
        s1.cardValid = true;
        s1.semesterNumber = 3;
        s1.averageGrade = 4;
        
        s1.displayInfo();
        s1.changeIdStatus();
        s1.displayIdInfo();
        
        
    }
    
    
}