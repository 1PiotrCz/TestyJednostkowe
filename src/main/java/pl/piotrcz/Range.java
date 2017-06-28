package pl.piotrcz;

/**
 * Created by Piotr Czubkowski on 2017-06-26.
 */
public class Range {
    private int start;
    private int stop;

    public Range(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public boolean isInRange(int number) {
        return number <= stop && number >= start ? true : false;
    }

    private void asda() {
    }

    //dokumentacja mowi, ze dodawanie moze byc tylko dodatnie
    public int addMethod(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Dont use args withs <0");
        }
        return a + b;
    }
}

