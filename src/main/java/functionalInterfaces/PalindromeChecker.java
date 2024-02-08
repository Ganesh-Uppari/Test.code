package functionalInterfaces;

public class PalindromeChecker {
    public static void main(String[] args) {
        int number = 12321;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        String input = "madam";
        String reverse = reverse(input);
        if(input.equals(reverse))
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is Not Palindrome");
    }
    public static String reverse(String input) {
        String output = "";
        for(int i = input.length() - 1; i >= 0; i--)
            output = output + input.charAt(i);
        return output;
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        // Reverse the number
        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }

        // Check if the reversed number is equal to the original number
        return originalNumber == reversedNumber;
    }
}
