//Write a method called 'shouldWakeUp' that has two parameters. 
//The first parameter should be of type boolean and be named 'barking', it represents if our dog is barking. 
//The second parameter represents the 'hour of the day' and is of type int with the name 'hourOfDay' and has a valid range of 0 - 23.
//We have to wake-up if the dog is barking before eight or after twentytwo hours, in this case it returns true.
//In all other cases it returns false.

//If the hourOfDay paramater is less than zero or greater than 23 it returns false.


public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if(hourOfDay < 8 && barking || hourOfDay > 22 && barking) {
            return true;
        } else {
            return false;
        }
    }
}


//public class Main {
   //public static void main(String[] args) {
       //boolean dog_barking = BarkingDog.shouldWakeUp(true, 23);
       //System.out.println(dog_barking);
   //}
//}