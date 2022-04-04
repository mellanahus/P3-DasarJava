// percobaan penerapan String menghitung jumlah huruf konsonan dan vokal

import java.util.Locale;

public class R_VowelConsonant {
    public static void main(String[] args) {

        // Character occurrence in a sentence analysis
        // the string that we want to analyze
        String s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather, Wash, and Repeat ";
        System.out.println(s);
        s = s.toLowerCase();

        // counters initialization
        int vowelCount = 0;
        int consonantCount = 0;

        // definition of character groups
        String vowels = "aeiouy";
        String consonants = "bcdfghijklmnpqrstvwxz";

        // convert from string to charArray
        char c[] = s.toCharArray();

        // main loop
        for (int i = 0; i < c.length; i++) {
            if(vowels.contains(String.valueOf(c[i]))) {
            vowelCount++;
        } else if (consonants.contains(String.valueOf(c[i]))){
            consonantCount++;
        }
    }
    System.out.printf("Vowels:%d\n",vowelCount);
    System.out.printf("Consonant:%d\n",consonantCount);
    System.out.printf("Others characters: %d\n",(c.length-(vowelCount+consonantCount)));

}
}