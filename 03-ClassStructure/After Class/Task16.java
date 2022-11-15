public class Task16  {
    static class InternetDevice {
        
        //list of arguments
        String name;
        boolean isConnected;
        static int connectedDevices;

        InternetDevice(String name)
        {
            this.name = name;
        }

        public void connect()
        {
            if(!isConnected)
            {
                isConnected = true;
                connectedDevices +=1;
            }
            
        }

        public void disconnect()
        {
            if(isConnected)
            {
                isConnected = false;
                connectedDevices -=1;
            }
        }
        public void displayStatus()
        {
            System.out.println(isConnected);
        }
        public static void displayConnections() {
            System.out.println(connectedDevices);
        }


        public static void main(String args[])
        {
            InternetDevice d1 = new InternetDevice("Laptop");
            InternetDevice d2 = new InternetDevice("Smartphone");
            InternetDevice d3 = new InternetDevice("AppleWatch");
            InternetDevice d4 = new InternetDevice("Ipad") ;
            InternetDevice d5 = new InternetDevice("TV");

            d2.connect();
            d3.connect();
            d4.connect();

            d1.displayStatus();
            d2.displayStatus();
            d3.displayStatus();
            d4.displayStatus();
            d5.displayStatus();
            InternetDevice.displayConnections();

        
        }
    }
}
