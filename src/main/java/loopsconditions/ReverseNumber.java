package loopsconditions;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseDigits(number);
        System.out.println("Input: " + number);
        System.out.println("Output: " + reversedNumber);
    }

    public static int reverseDigits(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}
