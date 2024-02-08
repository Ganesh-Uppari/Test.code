package exceptions;

public class StringToIntegerConverter {
    public static void main(String[] args) {
        // Call the method with different inputs and print the return value
        printConvertedValue("23");
        printConvertedValue("45.67");
        printConvertedValue("test");
        printConvertedValue("123f");
    }

    public static void printConvertedValue(String str) {
        try {
            int value = convertToInteger(str);
            System.out.println("Converted value of \"" + str + "\": " + value);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred for \"" + str + "\": " + e.getMessage());
        }
    }

    public static int convertToInteger(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }
}
