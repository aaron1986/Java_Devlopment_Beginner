//Write a method printYearsAndDays with a pararmeter of type long named 'minutes'.
//The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
//If the parameter is less than zero, print text "Invlaid Value".
//Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
//XX represents the orginal value of minutes.
//YY represents the calculted value of years.
//ZZ represents the calculated value of days.

public class MinutesToYearsDaysCalculator {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            String text = "Invalid Value";
            System.out.println(text);
        } else {

            long year = minutes / 525600;
            long remain = minutes % 525600;
            long day = remain / 1440;


            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }

    }
}


//public class Main {
//
//    public static void main(String[] args) {
//        MinutesToYearDaysCalcultor.printYearsAndDays(525600);
//    }
//}