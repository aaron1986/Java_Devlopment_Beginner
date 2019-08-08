public class NumberToWords {

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.print("Invalid Value");
        }

        int count = getDigitCount(number);
        int rev = reverse(number);

        while(count > 0) {
            int digit = rev % 10;
            rev /= 10;

            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            count--;
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;

        if(number == 0){
            count = 1;
        }
        
        if(number < 0) {
            return -1;
        }

        while(number > 0) {
            number /= 10;
            ++count;
        }
        return count;
    }

    public static int reverse(int num) {
        int reversed = 0;

        while(num > 0 || num < 0) {
   reversed = reversed * 10;
   reversed = reversed + num % 10;
   num = num / 10;

        }
        return reversed;
    }

    }
    
    
    public class Main {

    public static void main(String[] args){
//       answer = NumberToWords.numberToWords(432);
//         System.out.print(answer);

//        int answer_b = NumberToWords.getDigitCount(11);
//        System.out.println(answer_b);
//
//        int answer2 = NumberToWords.reverse(-2);
//        System.out.print(answer2);

    }
}