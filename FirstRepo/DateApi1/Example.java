package DateApi1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

public class Example {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
       String[] sw= TimeZone.getAvailableIDs();
       for(String f:sw){
           System.out.println(f);
       }
       System.out.println(TimeZone.getTimeZone("Egypt"));
       System.out.println(LocalDateTime.now(ZoneId.of("Egypt")));
       Timer t=new Timer();
        // t.scheduleAtFixedRate(new TimerTask() {
    
        //     @Override
        //     public void run() {
        //         System.out.println("Hello Aaryan");
        //     }
            
        // }, 1000, 4000);
        t.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("adidep");
                
            }
            
        }, 5);
       
    }
}
