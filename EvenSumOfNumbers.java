// Write a method named getEvenDigitSum with one parameter of type int called number.
// The method should return the sum of the even digits with the number.
// If the number is negative, the method should return -1 to indicate an invalid number.


public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if(number < 0){
            return -1;
        }

        int sum = 0;
        int remainder = 0;

        while(number > 0) {
            remainder = number % 10;
            if(remainder % 2 == 0) {
                sum = sum + remainder;
            }
            number = number / 10;
    }
        return sum;
    }
}

public class Main {

    public static void main(String[] args) {
        int total = EvenDigitSum.getEvenDigitSum(123456789);
        System.out.println(total);

    }

}