//Write a method named 'isLeapYear' with a parameter of type int named 'year'.
//The parameter needs to be greater than or equal to one and less than or equal to 9999.
//If the parameter is not in that range return false.
//Otherwise, if it is in the valid range calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

public class LeapYear {

    public static boolean isLeapYear(int year) {

        boolean yes = true;
        boolean no = false;

        if((year >= 1) && (year <= 9999)) {
            if((year % 4 == 0 && year % 100 != 0) || ((year % 4 == 0) && (year % 400 == 0))) {
                return yes;
            }
        }
        return no;
    }
}


//public class Main {

//public static void main(String[] args) {
    //boolean even = LeapYear.isLeapYear(-1200);
    //System.out.println(even);
//}

//}