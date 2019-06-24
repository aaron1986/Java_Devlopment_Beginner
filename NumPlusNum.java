public class EqualSumChecker {

    public static boolean hasEqualSum(int sum_one, int sum_two, int sum_three) {

        if(sum_one + sum_two == sum_three) {
            return true;
        }

        return false;
    }

}

//public class Main {
//
//    public static void main(String[] args) {
//        boolean equal_num = EqualSumChecker.hasEqualSum(1,1,1);
//        System.out.println(equal_num);
//    }
//
//}
