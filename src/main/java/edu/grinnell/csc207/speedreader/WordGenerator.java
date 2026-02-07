package edu.grinnell.csc207.speedreader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * A class that generates words from a text file and counts stats.
*/
public class WordGenerator {
    private Scanner text;
    private int wordCount;
    private int sentenceCount;

    /**
     * Makes a WordGenerator for the given file.
     * @param filename the name of the file to read
     * @throws IOException if the file cannot be opened
    */
    public WordGenerator(String filename) throws IOException {
        this.text = new Scanner(new File(filename));
        this.wordCount = 0;
        this.sentenceCount = 0;
    }

    /**
     * Checks if there are more words to read.
     * @return true if ther are more wrods,otherwise false
     */
    public boolean hasNext() {
        return this.text.hasNext();
    }

    /** 
     * Returns the next word and updates counts.
     * @return the next word from the file
    */
    public String next() {
        String nxt = this.text.next();
        if (nxt.endsWith("?") || nxt.endsWith(".") || nxt.endsWith("!")) {
            this.sentenceCount++;
        }
        this.wordCount++;
        return nxt;
    }

    /**
     * Gets the total number of words read so far.
     * @return the word count
     */
    public int getWordCount() {
        return this.wordCount;
    }

    /** 
     * Gets the total number of words read so far.
     * @return the word count
     */
    public int getSentenceCount() {
        return this.sentenceCount;
    }
}
