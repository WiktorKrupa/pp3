public class CinemaTicket {
    
    //list of atributes
    static String cinemaName = "Kino Krakow";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    //list of methods
    
    public void showInfo()
    {
        System.out.println("Name of cinema: "+ cinemaName);
        System.out.println("Film title: "+ filmTitle);
        System.out.println("row :"+ row +"\n" +"seat: "+seat);
        System.out.println("price: "+price+"zł");
    }
    
    public static void main(String[] args) {
        CinemaTicket t1 = new CinemaTicket();
        CinemaTicket t2 = new CinemaTicket();
        
        t1.filmTitle = "Auta 4";
        t1.row = 5;
        t1.seat = 16;
        t1.price = 18.50;
        
        t2.filmTitle = "Casablanca";
        t2.row = 12;
        t2.seat = 13;
        t2.price = 22.30;
        
        t1.showInfo();
        System.out.println('\n');
        t2.showInfo();
        
        
        
    }
    
    
}