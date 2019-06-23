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