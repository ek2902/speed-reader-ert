package edu.grinnell.csc207.mysteries;

/**
 * A data structure that holds a single element, an <code>int</code>.
 */
public class Cell {
    /** The value of the cell. */
    public int x;

    /**
     * Constructs a new cell.
     * @param x the initial value of the cell
     */
    public Cell(int x) {
        this.x = x;
    }

    /**
     * An example "change" method over <code>int</code>s.
     * @param x the <code>int</code> to modify (?) 
     */
    public static void change1(int x) {
        x = 5; // value
    }

    /**
     * An example "change" method over <code>Cell</code>s.
     * @param c the <code>Cell</code> to modify (?) 
     */
    public static void change2(Cell c) {
        c.x = 5; // reference 
    }

    /**
     * Another example "change" method over <code>Cell</code>s.
     * @param c the <code>Cell</code> to modify (?) 
     */
    public static void change3(Cell c) {
        c.x = 5;
        c = new Cell(0);
    }

    public static void main(String[] args) {
        // Fill me in to test your hypotheses!
        Cell a = new Cell(3);
        change1(a.x);
        System.out.println(a.x);
        change2(a);
        System.out.println(a.x);
        change3(a);
        System.out.println(a.x);
    }
}
