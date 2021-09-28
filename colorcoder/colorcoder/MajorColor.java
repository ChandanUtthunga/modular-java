package colorcoder;

public enum MajorColor   {
    WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);
    private int index;
    private MajorColor(int index) {
        this.index = index;
    }
    public int getIndex() {
        return index;
    }
}
