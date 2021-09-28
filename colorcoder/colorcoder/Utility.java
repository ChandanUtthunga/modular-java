package colorcoder;

import java.util.EnumSet;

public class Utility {


    static void testNumberToPair(int pairNumber,
                                 MajorColor expectedMajor,
                                 MinorColor expectedMinor)
    {
        ColorPair colorPair = GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert colorPair.getMajor() == expectedMajor : Constants.VALIDATION_FAILED;
        assert colorPair.getMinor() == expectedMinor : Constants.VALIDATION_FAILED;
    }

    static void pairToNumber(
            MajorColor major,
            MinorColor minor,
            int expectedPairNumber,boolean validationFlag)
    {
        int pairNumber = ColorPair.GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        if(validationFlag)
         assert pairNumber == expectedPairNumber : Constants.VALIDATION_FAILED;
        else{
            if(pairNumber==expectedPairNumber){
                System.out.println("Color pair to number matches");
            }else{
                System.out.println("Color pair to number doesn't  matches");
                System.out.println("For MajorColor:"+Constants.majorColors[major.getIndex()]+",MinorColor:"+Constants.minorColorNames[major.getIndex()]+" Correct Pair Numbers is:"+pairNumber);
            }
        }
    }

    static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = fromIndex((zeroBasedPairNumber / Constants.minorColorNames.length),MajorColor.class);
        MinorColor minorColor = fromIndex(zeroBasedPairNumber % Constants.minorColorNames.length,MinorColor.class);
        return new ColorPair(majorColor, minorColor);
    }

    public static  <E extends Enum<E>> E fromIndex(int index, Class<E> clazz) {
        for (E  enumVal: EnumSet.allOf(clazz))
        {
                if( enumVal instanceof  MajorColor){
                    MajorColor color= (MajorColor) enumVal;
                    if(color.getIndex() == index) {
                        return (E) color;
                    }
                }else{
                    MinorColor color= (MinorColor) enumVal;
                    if(color.getIndex() == index) {
                        return (E) color;
                    }
                }
        }

        return null;
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
