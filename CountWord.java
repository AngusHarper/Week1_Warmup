
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;
public abstract class CountWord {

    public static int count(String wordToCount) {
        int count = 0;
        File file = new File("/Users/angusharper/Desktop/OOSE2/Week1-Warmup_Ex/Holmes.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (Exception e) { 
            System.out.println("yo mama");
        }

        while (sc.hasNextLine()) {
            String[] sentences = sc.nextLine().split("\\.");
            for (String sentence : sentences) {
                if (sentence.contains("apple")) {
                    System.out.println(sentence);
                }
            }
        }
            return count;
        }

}


