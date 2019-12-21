package Introduction.Automobile;

public class Fiat extends Cars {
    public Fiat(int startSpeed) {
        super(startSpeed);
    }

    public void increaseSpeed() {
        protectedSpeed++;
        Cars c1 = new Cars();
        c1.decreaseSpeed();
        System.out.println("Increasing Speed of the Fiat");
    }

    public void headupDisplayNavigation()
    {
        System.out.println("Fiat not specific functionality");
    }

    public void openTopWindow() {

        System.out.println("Opens top window of Fiat");
    }
}
