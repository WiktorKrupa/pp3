public class Lamp {
    
    //list of atributes
    boolean isOn;
    
    //list of methods
    public void turnOn()
    {
        isOn = true;
    }
    public void turnOff()
    {
        isOn = false;
    }
    public String showStatus()
    {
        String check;
        if (isOn)
        {
            check = "on";
        }
        else
        {
            check="off";
        }
        return check;}
    
    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();
        
        l1.turnOn();
        l2.turnOff();
        
        System.out.println("Lamp1 is: "+ l1.showStatus());
        System.out.println("Lamp2 is: "+ l2.showStatus());
        
            
    }
}