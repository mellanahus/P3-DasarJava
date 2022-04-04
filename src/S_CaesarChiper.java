// Percobaan penerapan String program Cesar Chiper

public class S_CaesarChiper {
    public static void main(String[] args) {

        // The Caesar cipher
        // variable initialization
        String s = "blackholesarewheregoddividedbyzero";
        System.out.printf("Original message: o/os\n", s);
        String message = "";
        int shift = 1;
        //convert from string to charArray
        char arrayStr[] = s.toCharArray();

        // loop iterating over characters
        for (char c : arrayStr) {
            int i = (int) c;
            i += shift;
            if (i > ((int) 'z')) {
                i -= 26;
            }
            char newChar = (char) i;
            message += newChar;


            // printing
            System.out.printf("Encrypted message: %sln", message);

        }
    }
}