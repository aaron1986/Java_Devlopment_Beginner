//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//The method should return boolean anf it needs to return true if two double numbers are the same up to three decimal places.

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num_one, double num_two) {
        num_one = (long) (num_one * 1000);
        num_two = (long) (num_two * 1000);

        if(num_one == num_two) {
            return true;
        }

        return false;
    }

}

//public class Main {
//
//    public static void main(String[] args) {
//        boolean three_decimal = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
//        System.out.println(three_decimal);
//    }
//
//}