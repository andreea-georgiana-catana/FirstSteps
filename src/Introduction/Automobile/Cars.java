package Introduction.Automobile;

public class Cars {

    //this is a no access modifier, available only in this package
    int speed;
    //this is a private modifier, available only in this Class
    private int privateSpeed;
    //this is available anywhere in the java world by importing the package and Class
    public int publicSpeed;
    //this is available only in the package and in the sub-classes of classes from the package
    protected int protectedSpeed;
    int speedLimit = 100;
    int reverse;

    public Cars() {
        this(0);
    }

    public void setPrivateSpeed(int pSpeed) {
        privateSpeed = pSpeed;
    }

    public Cars (int startSpeed) {
        speed = startSpeed;
    }



    public void increaseSpeed() {
        if(speed < 100) {
            speed++;
            System.out.println("Increasing Speed of Cars");
        }
    }

    protected void decreaseSpeed() {
        speed--;
        System.out.println("Decreasing Speed of Cars");
    }

    public void putInReverse() {
        reverse--;
        System.out.println("Putting the Cars in Reverse");
    }
}
