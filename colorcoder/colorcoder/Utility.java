package colorcoder;
import java.util.EnumSet;

public class Utility {
    static void testNumberToPair(int pairNumber,
                                 MajorColor expectedMajor,
                                 MinorColor expectedMinor) {
        ColorPair colorPair = ColorPair.GetColorFromPairNumber(pairNumber);
        assert colorPair.getMajor() == expectedMajor : Constants.VALIDATION_FAILED;
        assert colorPair.getMinor() == expectedMinor : Constants.VALIDATION_FAILED;
    }

    static void pairToNumber(
            MajorColor major,
            MinorColor minor,
            int expectedPairNumber,boolean validationFlag)
    {
        int pairNumber = ColorPair.GetPairNumberFromColor(major, minor);
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
}
