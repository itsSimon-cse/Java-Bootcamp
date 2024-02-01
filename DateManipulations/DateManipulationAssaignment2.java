package DateManipulations;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateManipulationAssaignment2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a date. For eg.  29/01/2024 01:00 : ");
        String dateString = br.readLine();
        DateFormat parser = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            Date date = parser.parse(dateString);
            System.out.println("Input date : " + date);

            List<Date> dateList = new ArrayList<>();

            // 1. Add 1 day
            final long HOUR_MILLIS = 60 * 60 * 1000;
            final long DAY_MILLIS = 24 * HOUR_MILLIS;
            long originalTimestamp = date.getTime();
            long plusOneDayTimestamp = originalTimestamp + DAY_MILLIS;

            Date datePlusOne = new Date(plusOneDayTimestamp);
            dateList.add(datePlusOne);
            System.out.println("Plus 1 day: " + datePlusOne);

            // 2. Subtract 10 days
            long subTenDaysTimestamp = originalTimestamp - (10 * DAY_MILLIS);

            Date dateMinusTen = new Date(subTenDaysTimestamp);
            dateList.add(dateMinusTen);
            System.out.println("Minus 10 days: " + dateMinusTen);

            // 3. Add 1 hour
            long addOneHourTimestamp = originalTimestamp + HOUR_MILLIS;
            Date datePlusOneHour = new Date(addOneHourTimestamp);
            dateList.add(datePlusOne);
            System.out.println("Plus 1 hour: " + datePlusOneHour);

            // 4. Subtract 5h 30min
            long minusFiveAndAHalfTimestamp = originalTimestamp -
                    (long) (5.5 * HOUR_MILLIS);
            Date dateMinusFiveAndAHalf = new Date(minusFiveAndAHalfTimestamp);
            dateList.add(dateMinusFiveAndAHalf);
            System.out.println("Minus 5h 30min : "+ dateMinusFiveAndAHalf);

            // 5. Sort the dates
            Collections.sort(dateList);
            System.out.println("\nSorted list: ");
            System.out.println(dateList.toString());
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}