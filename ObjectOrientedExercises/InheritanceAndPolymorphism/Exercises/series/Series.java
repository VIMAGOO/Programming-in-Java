package series;

/**
 *
 * @author vimago
 */
public abstract class Series {
    protected int first;

    // Constructor
    public Series(int first) {
        this.first = first;
    }

    // Abstract method to get the next element
    public abstract int getNext();

    // Abstract method to reset the series
    public abstract void reset();
}
