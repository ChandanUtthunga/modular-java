package colorcoder;

public class Main {

    public static void main(String[] args) {
        printManual();
        Utility.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        Utility.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
        Utility.pairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12,true);
        Utility.pairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25,true);
        Utility.pairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 24,false);
    }

    public static void printManual() {
        int count =1;
        for( MajorColor majorColor: MajorColor.values() ){
            String majorColorName=Constants.majorColors[majorColor.getIndex()];
            for( MinorColor minorColor: MinorColor.values()){
                System.out.println("SL.NO:"+count+",MajorColor:"+majorColorName+",MinorColor:"+Constants.minorColorNames[minorColor.getIndex()]);
                count++;
            }
        }
    }


}
