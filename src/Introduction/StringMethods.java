package Introduction;

public class StringMethods {

    public static void main (String[] args){

        String str = "This a string method test";

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Welcome";

        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.concat(" and this is the concatenated string"));
        System.out.println(str.contains("test"));
        System.out.println(str.contains("mis"));
        System.out.println(str.startsWith("This"));
        System.out.println(str.startsWith("a"));
        System.out.println(str.endsWith("test"));
        System.out.println(str.endsWith("string"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

    }
}
