import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class Datetime1 {
    public static void main(String[] args)
    {
       LocalDateTime ad=LocalDateTime.now();
       System.out.println("before formatting="+ad);
       DateTimeFormatter lr=DateTimeFormatter.ofPattern("dd-mm-yy hh-mm-ss");
       String formatteddate=ad.format(lr);
       System.out.println(formatteddate);
    }
    
}