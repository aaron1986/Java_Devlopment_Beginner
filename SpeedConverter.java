//Write a method called toMilesPerHour that has one parameter of type double with the name kilometersPerHour.
//The above method needs to return the rounded value of the calculation of type long.
//If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
//Otherwise, if it is positive, calaculate the value of miles per hour, round it and return it.

//Write another method called printConversion with one parameter of type double with the name kilometersPerHour.
//This method should not return anything (void) and it nees to calculate milesPerHour from the kilometersPerHour parameter.
//It needs to print a message in the format "xx km/h = YY mi/h".
//XX represents the orginal value kilometersPerHour.
//YY respresents the rounded milesPerHour from the kilometersPerHour parameter.
//If the parameter kilometersPerHour is less than 0 then print the text "Invalid Value".

public class SpeedConverter {
    
        public static long toMilesPerHour(double kilometersPerHour) {
            
        if(kilometersPerHour < 0) {
            return -1;
        }
        
        return Math.round(kilometersPerHour / 1.609);
    }
    
    public static void printConversion(double kilometersPerHour) {
        
         if(kilometersPerHour < 0) {
             System.out.println("Invalid Value");
         } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
         }
    }

}

//public class Main {
//
//    public static void main(String[] args) {
//        long miles = SpeedConverter2.toMilesPerHour(10.25);
//        System.out.println(miles + " mi/h");
//
//        SpeedConverter2.printConversion(10.25);
//
//    }
//}