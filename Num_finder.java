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