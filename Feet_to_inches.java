//Create a method called calcfeetAndInchesToCentimeters
//It needs to have two parameters, feet is the first parameter, inches is the second parameter.
//You should vindicate that the first parameter feet is >= 0
//You should vindicate that the second parameter is >= 0 and <= 12
//Return -1 from the method if either of the above is not true;
//If is the parameters are valid then calculate how many centimeters comprise the feet and inches passed to this method and return that value.

//Create a second method of the same name but with only one parameter called inches.
//Validate that its >=0.
//Return -1 if is not true.
//But if it's valid then calculate how many feet are in the inches.

public class Main {

    public static void main(String[] args) {
        calcfeetAndInchesToCentimeters(100);
    }

    public static double calcfeetAndInchesToCentimeters(double feet, double inches) {
        if((feet >= 0) || (inches >= 0 && inches <= 12)) {
            double feet_to_cm = 30.48;
            double feet_result = feet * feet_to_cm;

            double cm = 2.54;
            double inch_result = inches * cm + feet_result;
            System.out.println(feet + " feet, " + inches + " inches = " +  inch_result + "cm");
        }
        return -1;
    }

    public static double calcfeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            double feet = (int) inches / 12; //We want to return a whole number so we use an int.
            double remain = (int) inches % 12; //We want to return a whole number so we use an int.
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remain + " inches");
            return calcfeetAndInchesToCentimeters(feet, remain);
        }
        return -1;
    }
}