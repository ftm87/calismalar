package d1_wrapperclass;

public class Wrapper01 {
    public static void main(String[] args) {

        //byte , short,ve int in maximum degerlerini kodla bulunuz


        byte maxByte =Byte.MAX_VALUE;
        System.out.println(maxByte);//127

        byte minByte=Byte.MIN_VALUE;
        System.out.println(minByte);//-128



        short maxShort=Short.MAX_VALUE;
        System.out.println(maxShort);//32767


        short minShort=Short.MIN_VALUE;
        System.out.println(minShort);//-32768


        int maxInt=Integer.MAX_VALUE;
        System.out.println(maxInt);//2147483647

        int minInt =Integer.MIN_VALUE;
        System.out.println(minInt);//-2147483648

        long maxLong=Long.MAX_VALUE;
        System.out.println(maxLong);//9223372036854775807

        long minLong =Long.MIN_VALUE;
        System.out.println(minLong);//-9223372036854775808


        float maxFloat=Float.MAX_VALUE;
        System.out.println(maxFloat);

        double maxDouble=Double.MAX_VALUE;
        System.out.println(maxDouble);


        String name="Ali Can";

        name.toUpperCase();// buyuk harf yazdirir
        System.out.println(  name.toUpperCase());//ALI CAN




    }
}
