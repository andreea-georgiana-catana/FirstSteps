package Introduction.staticPackage;

public class StaticKeynotesDemo {

    public int addNum = 10;
    public static int addNumStatic = 10;

    public static void main (String[] args) {
        StaticKeynotesDemo s1 = new StaticKeynotesDemo();
        int output = s1.sum(20);
        int outputStatic = sumStatic(50);
        System.out.println("The output is: " + output);
        System.out.println("The static output is: " + outputStatic);
    }

    public int sum(int num){
        return num + addNum;
    }

    public static int sumStatic(int num){
        return num + addNumStatic;
    }
}
