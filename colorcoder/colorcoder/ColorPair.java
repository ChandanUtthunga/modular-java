package colorcoder;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;
    final static int numberOfMinorColors = Constants.minorColorNames.length;

    public ColorPair(MajorColor major, MinorColor minor)
    {
        this.majorColor = major;
        this.minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }

    String ToString() {
        String colorPairStr = Constants.majorColors[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += Constants.minorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }

    static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor =
                Utility.fromIndex(zeroBasedPairNumber / numberOfMinorColors,MajorColor.class);
        MinorColor minorColor =
                Utility.fromIndex(zeroBasedPairNumber % numberOfMinorColors,MinorColor.class);
        return new ColorPair(majorColor, minorColor);
    }

    static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }
}
