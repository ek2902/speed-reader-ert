package edu.grinnell.csc207.speedreader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/** TODO: implement this class and add a doc comment! */
public class WordGenerator {
    private Scanner text;
    private int wordCount;
    private int sentenceCount;

    /** TODO: implement me and add an appropriate doc comment! */
    public WordGenerator(String filename) throws IOException {
        this.text = new Scanner(new File(filename));
        this.wordCount = 0;
        this.sentenceCount = 0;
    }

    /** TODO: implement me and add an appropriate doc comment! */
    public boolean hasNext() {
        return this.text.hasNext();
    }

    /** TODO: implement me and add an appropriate doc comment! */
    public String next() {
        String nxt = this.text.next();
        if (nxt.endsWith("?") || nxt.endsWith(".") || nxt.endsWith("!")) {
            this.sentenceCount++;
        }
        this.wordCount++;
        return nxt;
    }

    /** TODO: implement me and add an appropriate doc comment! */
    public int getWordCount() {
        return this.wordCount;
    }

    /** TODO: implement me and add an appropriate doc comment! */
    public int getSentenceCount() {
        return this.sentenceCount;
    }
}
