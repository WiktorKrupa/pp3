public class TempConversion{
    //list of atributes
    
    double temp;
    
    
    //list of methods
    
    public void celciusToKelvin()
    {
        temp += 273.15;
        System.out.println(temp);
    }
    
    public double kelvinToCelcius(double kelvin)
    {
        kelvin -= 273.15;
        return kelvin;
    }
    
    public double celciusToFahrenheit(double celcius)
    {
        celcius *=1.8;
        celcius +=32;
        return celcius;
    }
    
    public double fahrenheitToCelcius(double fahrenheit)
    {
        fahrenheit -=32;
        fahrenheit/=1.8;
        return fahrenheit;
    }
    
 
    
    public static void main (String[] args)
    {
        TempConversion celcius = new TempConversion();
        TempConversion kelvin = new TempConversion();
        TempConversion fahrenheit = new TempConversion();
        
        celcius.temp = 25;
        fahrenheit.temp = 100;
        kelvin.temp = 0;
        
        celcius.celciusToKelvin();
        
        
    }
    

}