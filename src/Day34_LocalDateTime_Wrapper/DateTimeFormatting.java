package Day34_LocalDateTime_Wrapper;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

    public static void main(String[] args) {

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        LocalDate today = LocalDate.now();

        System.out.println(today);

        today.format(DF);

        System.out.println(today.format(DF));

        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm");
        LocalTime currentTime = LocalTime.now();


        System.out.println(currentTime);
        System.out.println(currentTime.format(TF));

        LocalTime time1 = LocalTime.of(17, 25);
        System.out.println(time1);

        System.out.println(time1.format(TF));

        System.out.println("-----------------------------------------");

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY, EEEE hh:mm a");

        LocalDateTime a = LocalDateTime.now();

        System.out.println(a);

        System.out.println(a.format(DTF));

        System.out.println("-----------------------------------------");

        //Tuesady, 1:00 pm, Nov/24/2020

        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/YYYY");

        LocalDateTime time2 = LocalDateTime.of(2020, 11, 24, 13, 0);

        System.out.println(time2);

        System.out.println(time2.format(format));

        // What day is 2022-01-01

        String result = LocalDate.of(2022, 1, 1).format(DateTimeFormatter.ofPattern("EEEE"));

        System.out.println("result = " + result);

        System.out.println(nameOfTheDay(2025, 5, 28));

    }

        public static String nameOfTheDay(int year, int month, int day){

            String result = LocalDate.of(year, month, day).format(DateTimeFormatter.ofPattern("EEEE"));

            return result;


        }

    }


// MM/dd/YYYY
//