
public class Distance {
    int value;
    boolean infinity;


    public Distance(int distance, boolean infinity) {
        this.value = distance;
        this.infinity = infinity;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
