package edu.grinnell.csc207.speedreader;

import java.awt.*;
import java.io.IOException;

/** TODO: implement this class and add a doc comment! */
public class SpeedReader {
    /** TODO: implement me and add an appropriate doc comment! 
     * @throws IOException
     * @throws InterruptedException */
    public static void main(String[] args) throws InterruptedException, IOException {
        if (args.length != 5) {
            System.out.println("Usage: Usage: SpeedReader <filename> <width> <height> <font size> <wpm>");
            System.exit(1);
        }

        String filename = args[0];
        int width = Integer.parseInt(args[1]);
        int height = Integer.parseInt(args[2]);
        int fontSize = Integer.parseInt(args[3]);
        int wpm = Integer.parseInt(args[4]);
        int sleepTime = 60000 / wpm;
        
        WordGenerator gen = new WordGenerator(filename);

        DrawingPanel panel = new DrawingPanel(width, height);
        Graphics g = panel.getGraphics();
        Font f = new Font("Courier", Font.BOLD, fontSize);
        g.setFont(f);
        
        while (gen.hasNext()) {
            panel.clear();
            String word = gen.next();
            panel.sleep(sleepTime / 2);
            g.drawString(word, 100, 100);
            panel.sleep(sleepTime / 2);
        }
        
        System.out.println("Total number of words: " + gen.getWordCount());
        System.out.println("Total number of sentences: " + gen.getSentenceCount());
    }
}
