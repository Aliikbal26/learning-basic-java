public class TypeDataNotPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000000000L;

        Byte iniByte = null;

        int iniInt = 100;
        Integer iniObjecInteger = iniInt;

        short iniShort = iniObjecInteger.shortValue();
        long iniLong2 = iniObjecInteger.longValue();
    }

}
