package nyc.c4q.tashsmit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by c4q-tashasmith on 3/28/15.
 */
public class Dictionary {

    private ArrayList<String> words;

    public Dictionary(File yourFile) {

       words = new ArrayList<String>();

        try {
            Scanner input = new Scanner(yourFile);
            while (input.hasNext()) {
                words.add(input.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void wordSearch(String searchTerm) {
        int wordCount = 0;
        for (String word : words) {

            if (word.contains(searchTerm)) {
                System.out.println(word);
                wordCount++;
            }
        }
        System.out.println("Number of hits: " + wordCount);

    }

    public void prefixSearch(String searchTerm) {
        int wordCount = 0;
        for (String word : words) {

            if (word.startsWith(searchTerm)) {
                System.out.println(word);
                wordCount++;
            }
        }
        System.out.println("Number of hits: " + wordCount);

    }

    public void suffixSearch(String searchTerm) {
        int wordCount = 0;
        for (String word : words) {

            if (word.endsWith(searchTerm)) {
                System.out.println(word);
                wordCount++;
            }
        }
        System.out.println("Number of hits: " + wordCount);

    }

}
