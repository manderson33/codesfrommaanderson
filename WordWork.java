package textnumber;

/**
 * @author maanderson, 03-22-2022
 */
public class WordWork {

    /**
     * Reverses the String str
     *
     * @param str is any string
     * @return the reversed word
     */
    public static String flipWord(String str) {
        String flipped = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            flipped += str.substring(i, i + 1);

        }
        return flipped;
    }

    /**
     * Deletes the space (" ") and dashes (-)
     * if str is a multiple word and or separated with a dash
     *
     * @param str
     * @return a combined/single word without hyphen and or space in between
     */
    public  String makeSingleWord(String str) {

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (!str.substring(i, i + 1).equals(" ") && !str.substring(i, i + 1).equals("-")) {
                str2 += str.substring(i, i + 1);
            }
        }
        return str2;
    }

    /**
     * Checks if a word is Palindrome
     * Converts the str into a single word
     * if str value has multiple words or has dashes
     * A palindrome is a word, number, phrase, or other sequence of characters
     * which reads the same backward as forward
     *
     * @param str a single or combined word
     * @return true if str is Palindrome, false otherwise
     */
    public  boolean isPalindrome(String str) {
        boolean isPalindrome = false;
        if (flipWord(str).equalsIgnoreCase(str)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }


    /**
     * Creates and returns an alternate text formed
     * from every other letter of String str
     * Converts str as a single word
     * If str is of even length, alternate text starts at end of str
     * If str is of odd length, alternate text starts at the first letter of str
     *
     * @param str is a string
     * @retirm
     */
    public  String createAlternateText(String str) {
        String altWord = makeSingleWord(str);

        String result = "";
        if (altWord.length() % 2 == 0) {
            for (int i = 0; i < altWord.length(); i += 2) {
                result += altWord.substring(i, i + 1);
            }
        }else{
            altWord = flipWord(altWord);
            for (int i = 0; i < altWord.length(); i += 2) {
                result += altWord.substring(i, i + 1);
            }
        }

        return result;

    }

    /**
     * Prints a rectangle of random letters
     * generated from String word all in lowercase
     * @param row  number of rows to print
     * @param col  number of columns to print
     *             Example: if word = "Teacher", row = 4, col = 4
     *             Example output:
     *             e a t c
     *             t t e c
     *             a a e a
     *             e c t a
     * @param word
     */
    public  String printRectLetters(String word, int row, int col) {
        String newWord = makeSingleWord(word);
        String box = "";
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                int ran = (int) (Math.random() * newWord.length());
                box += newWord.substring(ran, ran + 1).toLowerCase() + "\t";
            }
            box += "\n";
        }
        return box;
    }

}
