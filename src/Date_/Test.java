// Date
// set of classes for handling date and time
// java.time library
//classes - LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Period, Duration

package Date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

public class Test {

  public static void main(String[] args) {
    // LocalDate
    LocalDate currentDate = LocalDate.now();
    System.out.println(currentDate); //2024-01-02

    // LocalTime
    LocalTime currentTime = LocalTime.now();
    System.out.println(currentTime);

    // LocalDateTime - both date and time.
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println(currentDateTime);

    // ZonedDateTime
    ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
    System.out.println(currentZonedDateTime);

    //parse
    String dateStr = "2024-01-02";
    LocalDate parsedDate = LocalDate.parse(dateStr);
    System.out.println(parsedDate);

    String timeStr = "12:30:45";
    LocalTime parsedTime = LocalTime.parse(timeStr);
    System.out.println(parsedTime);
    System.out.println("-------");

    //calculate future date time
    LocalDateTime cur = LocalDateTime.now();
    LocalDateTime calci = cur.plusDays(5).minusHours(3);
    System.out.println("Future Date and Time: " + calci);

    //Comparing Dates and Times
    LocalDate date1 = LocalDate.of(2022, 1, 1);
    LocalDate date2 = LocalDate.of(2024, 1, 1);

    if (date1.isBefore(date2)) {
      System.out.println(date1 + " is before " + date2);
    } else {
      System.out.println(date1 + " is after or equal to " + date2);
    }

    // DateTimeFormatter
    DateTimeFormatter myObj = DateTimeFormatter.ofPattern(
      "dd-MM-yyyy HH:mm:ss"
    );
    LocalDateTime timerCur = LocalDateTime.now();
    System.out.println(timerCur.format(myObj));

    System.out.println(
      LocalDateTime
        .now()
        .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))
    );

    System.out.println(
      LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
    );

    // String dateStr = "2024-01-02 15:30:00";
    String dateS = "1999-04-15";
    System.out.println(LocalDate.parse(dateS));

    String dats1 = "2024-01-02 05:30:00";
    DateTimeFormatter fr1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    System.out.println(LocalDateTime.parse(dats1, fr1));
  }
}
