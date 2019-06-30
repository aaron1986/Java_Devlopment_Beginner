//Write a method called 'isCatPlaying' that has two parameters. The method needs to return true if the cat is playing, otherwise return false.
//The first paramater should be of type boolean and be named 'summer' it represents if it is summer.
//The second parameter represents the temperature and is of type int with the name temperature.

//The cat spends most of the day playing, in particular they play if the temperature is between 25 and 35 (inclusive). Unless it is summer then the upper limit is 45 (inclusive) instead of 35.

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {

        boolean yes = true;
        boolean no = false;

        if(summer == true && temperature >= 25 && temperature <= 45) {
            return yes;
        }

        if(summer == false && temperature >= 25 && temperature <= 35) {
            return yes;
        }
        return no;
    }
}

//public class Main {
//
//    public static void main(String[] ags) {
//        boolean fff = PlayingCat.isCatPlaying(true, 33);
//        System.out.println(fff);
//    }
//}