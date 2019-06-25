//Write a method named 'hasTeen' with three parameters of type int
//The method should return boolean and it needs to return true if one of the parameters is in range (13 -19)
//Otherwise it should return false
//Write another method called 'isTeen' with one parameter of type int
//The method should return boolean and it needs to return true if the parameter is in range (13 - 19)
//Otherwise it should false


public class TeenNumberChecker {

    public static boolean hasTeen(int num_one, int num_two, int num_three) {
        if(isTeen(num_one) || isTeen(num_two) || isTeen(num_three)) {
            return true;
        }

        return false;
    }

    public static  boolean isTeen(int num_one) {
        if(num_one >= 13 && num_one <= 19) {
            return true;
        }

        return false;
    }

}

//public class Main {
//
//    public static void main(String[] args) {
//        boolean right_result = TeenNumberChecker.hasTeen(22,23,24);
//
//        System.out.println(right_result);
//    }
//
//}
