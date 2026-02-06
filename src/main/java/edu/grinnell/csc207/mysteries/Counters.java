package edu.grinnell.csc207.mysteries;

class Counter1 {
    public int value;
    public void increment() {
        value += 1;
    }
}

class Counter2 {
    public int value;
    public void increment(int value) {
        value += value;
    }
}

class Counter3 {
    public int value;
    public void increment(int value) {
        this.value += value;
    }
}

class Counter4 {
    public int value;
    public void increment(int value) {
        value += this.value;
    }
}
  
public class Counters {
    public static void main(String[] args) {
        // Fill me in to test your hypotheses!
        Counter1 c1 = new Counter1();
        c1.value = 0;
        c1.increment();
        System.out.println(c1.value);
        Counter2 c2 = new Counter2();
        c2.value = 4;
        c2.increment(3);
        System.out.println(c2.value);
        Counter3 c3 = new Counter3();
        c3.value = 4;
        c3.increment(3);
        System.out.println(c3.value);
        Counter4 c4 = new Counter4();
        c4.value = 4;
        c4.increment(3);
        System.out.println(c4.value);
    }
}
