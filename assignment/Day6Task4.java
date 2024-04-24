public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        int length = 3;

        String middleSubstring = extractMiddleSubstring(str1, str2, length);
        System.out.println("Middle substring of concatenated and reversed strings: " + middleSubstring);
    }

    public static String extractMiddleSubstring(String str1, String str2, int length) {
        // Concatenate the two strings
        String concatenatedString = str1.concat(str2);

        // Reverse the concatenated string
        String reversedString = new StringBuilder(concatenatedString).reverse().toString();

        // Edge case: if the concatenated string is empty or length is larger than the concatenated string
        if (reversedString.isEmpty() || length > reversedString.length()) {
            return "Invalid input";
        }

        // Calculate the starting index of the middle substring
        int startIndex = (reversedString.length() - length) / 2;

        // Extract the middle substring of the given length
        String middleSubstring = reversedString.substring(startIndex, startIndex + length);

        return middleSubstring;
    }
}
