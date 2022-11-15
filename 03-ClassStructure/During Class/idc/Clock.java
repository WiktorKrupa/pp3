public class Clock {
    int hour;
    int minute;

    Clock(){
        hour = 00;
        minute = 00;

    }
    Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    void setClock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;

    }
    void setClock(){
        hour = 00;
        minute = 00;

    }
    void displayTime(){
        if(minute<10 && hour<10){
            System.out.println('0'+hour+';'+'0'+minute);
        }
        else if(minute<10){
            System.out.println(hour+';'+'0'+minute);
        }
        else if(hour<10){
            System.out.println('0'+hour+';'+minute);
        }
        else{
            System.out.println(hour+';'+minute);
        }
        
    }
    void addOneMinute(){
        minute+=1;
        if (minute ==60){
            minute=0;
            hour+=1;
        }
        if (hour==24);
        {
            hour =0;
        }
    }
    public static void main(String[] args){
        Clock c = new Clock(12, 47);
        c.displayTime();
        c.setClock(18,14);
        c.displayTime();
        c.setClock(9, 3);
        c.displayTime();
        c.setClock(23,58);
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
        c.addOneMinute();
        c.displayTime();


    }


}