package strings;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String input = "Java J2EE Reverse Me";
        String output = reverseWordsInSentence(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String reverseWordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }

        // Remove the trailing space before returning the result
        return reversedSentence.toString().trim();
    }

    public static String reverseWord(String word) {
        char[] characters = word.toCharArray();
        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            // Swap characters
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;

            // Move indices towards each other
            start++;
            end--;
        }

        return new String(characters);
    }
}
