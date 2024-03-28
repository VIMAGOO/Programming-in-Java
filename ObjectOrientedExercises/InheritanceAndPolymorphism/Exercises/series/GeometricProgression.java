package series;

/**
 *
 * @author vimago
 */
public class GeometricProgression extends Series{
    private final int commonRatio;
    private int current;

    // Constructor
    public GeometricProgression(int first, int commonRatio) {
        super(first);
        this.commonRatio = commonRatio;
        this.current = first;
    }

    // Method to get the next element
    @Override
    public int getNext() {
        int next = current;
        current *= commonRatio;
        return next;
    }

    // Method to reset the series
    @Override
    public void reset() {
        current = first;
    }
}
