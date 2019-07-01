//Write a method isLeapYear with a parameter of type int named 'year'
//The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//If the parameter is not in that range return false.
//Otherwise, if it is in the valid range, calulate if the year is a leap year and return true if it is, otherwise return false.

//Write another method getDaysInMonth with two parameters month and year - both od type int.
//If parameter month os < 1 or > 12 return -1.
//If parameter year is < 1 or > 9999 then return -1.
//This method needs to return the number of days in the month (Feb leap year is 29 days).


public class NumberOfDaysInMonth {
  public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999)) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0) && year % 400 == 0) {
                return true;
            }
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
        }
        return 0;
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        boolean tt = NumberOfDaysInMonth.isLeapYear(2017);
//        System.out.println(tt);
//
//        int kk = NumberOfDaysInMonth.getDaysInMonth(2, 2018);
//        System.out.println(kk);
//    }
//}