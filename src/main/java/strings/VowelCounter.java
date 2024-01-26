package strings;

public class VowelCounter {
    public static void main(String[] args) {
        String inputString = "Hello, how are you?";
        int result = countVowels(inputString);
        System.out.println("The number of vowels in \"" + inputString + "\" is: " + result);
    }

    public static int countVowels(String inputString) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (char ch : inputString.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }
}
