//Write a method named 'hasTeen' with three parameters of type int
//The method should return boolean and it needs to return true if one of the parameters is in range (13 -19)
//Otherwise it should return false
//Write another method called 'isTeen' with one parameter of type int
//The method should return boolean and it needs to return true if the parameter is in range (13 - 19)
//Otherwise it should false


public class TeenNumberChecker {
    public static boolean hasTeen(int num_one, int num_two, int num_three) {

        for(int i = 13; i <= 19; i++) {
            if(num_one == i || num_two == i || num_three == i) {
                return true;
            }
        }

        return false;
    }
    
    public static boolean isTeen(int num_four) {
        for(int n = 13; n <= 19; n++) {
            if(num_four == n) {
                return true;
            }
        }
        return false;
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        boolean TeenNumbers = TeenNumberChecker.hasTeen(22, 23, 34);
//        System.out.println(TeenNumbers);
//    }
//
//}