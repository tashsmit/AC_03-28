package nyc.c4q.tashsmit;

import java.io.File;

/**
 * Created by c4q-tashasmith on 3/28/15.
 */
public class Main {
    public static void main(String[] args) {

        File dictionary = new File("/Users/c4q-tashasmith/Desktop/accesscode/AC_03-28/words");

        Dictionary myDictionary = new Dictionary(dictionary);
        myDictionary.wordSearch("ands");
    }
}
