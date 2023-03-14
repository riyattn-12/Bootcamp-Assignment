import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class ques6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in yyyy-mm-dd format");
        String date1 = sc.nextLine();
        String date2= sc.nextLine();
        LocalDate firstdate = LocalDate.parse(date1);
        LocalDate seconddate = LocalDate.parse(date2);
        if(firstdate.isAfter(seconddate))
        {
            System.out.println("first date is after second date");
        }
        else if(firstdate.isBefore(seconddate))
        {
            System.out.println("first date is after second date");
        }
        else {
            System.out.println("first date is same as second date");
        }
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("Europe"));
        System.out.println("date and time in Madrid"+df.format(date));
        df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));

    }
}
