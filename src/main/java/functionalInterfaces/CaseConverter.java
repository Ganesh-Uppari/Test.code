package functionalInterfaces;

public class CaseConverter {
    public static void main(String[] args) {
        String str = "Hello World 123";
        String convertedStr = convertCase(str);
        System.out.println("Original String: " + str);
        System.out.println("Converted String: " + convertedStr);
    }

    public static String convertCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            }
        }
        return new String(charArray);
    }
}
