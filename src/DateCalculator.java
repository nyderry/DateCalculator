import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by Ny Derry on 7/4/2017.
 Deliverable 2 Task: Write a Java console application to calculate the duration between two dates in Years,
 Months, and Days. The user should enter two dates as input, then the program will show the result of the
 difference in time between these two dates.*/
public class DateCalculator {

    public static void main(String[] args ){
      //  System.out.println(getDate("04/07/2017"));
        //find information on try-catch method get input in the correct format (found by Google examples)
        try {
            // prompt user for first date input
            System.out.println("Input your first date: (mm/dd/yyyy) ");
            // get user input
            Scanner scan = new Scanner(System.in);
            String dayOneString = scan.nextLine();

            // promput user for second date input
            System.out.println("Input your second date: (mm/dd/yyyy) ");
            // get user input
            String dayTwoString = scan.nextLine();


            // convert user input to 'LocalDate' format using LocalDate method below
            LocalDate dayOne = getDate(dayOneString);
            LocalDate dayTwo = getDate(dayTwoString);
            // use date.util class function of 'Period' to calculate the duration (in years,months,days,seconds,etc)
            Period duration = Period.between(dayOne,dayTwo);

            // output the "duration" that is split up in Years, Months, and Days, with the 'get' function
            System.out.println("In Years "+duration.getYears());
            System.out.println("In Months "+duration.getMonths());
            System.out.println("In Days "+duration.getDays());

        //find information on try-catch method get input in the correct format (found by Google examples). The "catch" command is
            // needed for the try-catch to work with exceptions (not covered yet), dates that are not in expected format
        }catch (Exception e){

        }

    }
        // method for the LocalDate and getDate formatting
    public static LocalDate getDate(String dateString){
        LocalDate myDate=null;
        // establishing the "DateTimeFormatter" formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //find information on try-catch method get input in the correct format (found by Google examples)
        try {
            myDate = LocalDate.parse(dateString, formatter);

            //find information on try-catch method get input in the correct format (found by Google examples). The "catch" command is
            // needed for the try-catch to work with exceptions (not covered yet), dates that are not in expected format
        }catch(Exception e){
            e.printStackTrace();

            //returning null when exception is found
            return null;
        }

        //returning myDate when try-catch is complete
        return myDate;


    }

}
