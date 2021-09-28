package colorcoder;

public class Main {

    public static void main(String[] args) {
        Utility.printManual();
        Utility.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        Utility.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
        Utility.pairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12,true);
        Utility.pairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25,true);
        Utility.pairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 24,false);
    }


}
