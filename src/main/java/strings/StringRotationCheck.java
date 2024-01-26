package strings;

public class StringRotationCheck {
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        if (isRotation(str1, str2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }

    public static boolean isRotation(String str1, String str2) {
        // Check if lengths are equal and not zero
        if (str1.length() == str2.length() && str1.length() > 0) {
            // Concatenate str1 with itself
            String concatenated = str1 + str1;

            // Check if str2 is a substring of the concatenated string
            return concatenated.contains(str2);
        }
        return false;
    }
}
