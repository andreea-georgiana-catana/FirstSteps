package Introduction;

public class DefaultVariableValues {

    static byte byteVariable;
    static short shortVariable;
    static int integerVariable;
    static long longVariable;
    static float floatVariable;
    static double doubleVariable;
    static boolean booleanVariable;
    static char charVariable;

    public static void main(String [] args){

        System.out.println("Byte value: " + byteVariable);
        System.out.println("Short value: " + shortVariable);
        System.out.println("Int value: " + integerVariable);
        System.out.println("Long value: " + longVariable);
        System.out.println("Float value: " + floatVariable);
        System.out.println("Double value: " + doubleVariable);
        System.out.println("Boolean value: " + booleanVariable);
        System.out.println("Char value: " + charVariable);
    }

    public static void oneMoreMethod() {

        System.out.println("Int value: " + integerVariable);
    }
}
