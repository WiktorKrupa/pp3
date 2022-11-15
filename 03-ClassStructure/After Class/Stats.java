public class Stats
{
    // list of arguments
    int x;
    int y;
    
    //list of methods
    
    public void numInRange()
    {
        System.out.println(y-x);
    }
    public void sumInRange()
    {
        int sum=0;
        for (int i=x; i<=y; i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
    public void arithMean()
    {
        double mean = 0;
        mean=(mean+x+y)/2;
        System.out.println(mean);
    }
    
    public static void main(String[] args) {
       Stats s1 = new Stats();
       s1.x = 10;
       s1.y = 5;
        
        if (s1.x>s1.y)
        {
            int temp = s1.x;
            s1.x = s1.y;
            s1.y = temp;
        }
        
        s1.numInRange();
        s1.sumInRange();
        s1.arithMean();
        
    }
}
