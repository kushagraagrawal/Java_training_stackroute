import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastDayOfWeek {
    public static void main(String[] args){

        Calendar c = Calendar.getInstance();


        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String str[] = {"year", "month", "day" };
        String date = "";

        for(int i=0; i<3; i++) {
            System.out.println("Enter " + str[i] + ": ");
            date = date + scanner.next() + "/";
        }
        date = date.substring(0, date.length()-1);
        //   System.out.println("date: "+ date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date parsedDate = null;

        try {
            parsedDate = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        c.setTime(parsedDate);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        //     System.out.println(dayOfWeek);

        if(dayOfWeek == 1){
            c.add(Calendar.DAY_OF_MONTH, -6);
        }
        else {
            c.add(Calendar.DAY_OF_MONTH, 2 - dayOfWeek);
        }
        String newDate = dateFormat.format(c.getTime());

        Date monday = null;
        try {
            monday = dateFormat.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(monday);
        c.add(Calendar.DAY_OF_MONTH,6);

        String newDate1 = dateFormat.format(c.getTime());

        System.out.println("Mon " + newDate);
        System.out.println("Sun " + newDate1);

    }
}
