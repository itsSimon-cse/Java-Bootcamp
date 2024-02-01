package DateManipulations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateManipulationAssaignment1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a date. For eg.  29/01/2024 01:00 : ");
        String dateString = br.readLine();
        DateFormat parser = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            Date date = parser.parse(dateString);
            System.out.println("Input date : " + date);

            // 1. Local date to Unix timestamp
            long unixTimestamp = date.getTime();
            System.out.println("Unix timestamp (millis): " + unixTimestamp);

            // 2. Local timezone to UTC timezone
            DateFormat utcFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));

            // Use DateFormat to get date string in UTC timezone
            String utcDateString = utcFormatter.format(date.getTime());
            System.out.println("UTC date : " + utcDateString);

            // 3. UTC to Local timestamp (IST)

            // get date object from UTC date string
            Date utcDate = utcFormatter.parse(utcDateString);

            System.out.println(utcDate);

            parser.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

            // use DateFormat to get date string in local timezone
            String localDateString = parser.format(utcDate);
            System.out.println("UTC to Local date: " + localDateString);

        }
        catch (ParseException e) {
            System.out.println("Invalid input format! Please input in given format only.");
        }

    }
}