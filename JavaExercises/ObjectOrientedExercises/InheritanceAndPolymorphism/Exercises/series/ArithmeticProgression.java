package series;

/**
 *
 * @author vimago
 */
public class ArithmeticProgression extends Series{
    private final int commonDifference;
    private int current;

    // Constructor
    public ArithmeticProgression(int first, int commonDifference) {
        super(first);
        this.commonDifference = commonDifference;
        this.current = first;
    }

    // Method to get the next element
    @Override
    public int getNext() {
        int next = current;
        current += commonDifference;
        return next;
    }

    // Method to reset the series
    @Override
    public void reset() {
        current = first;
    }
}
