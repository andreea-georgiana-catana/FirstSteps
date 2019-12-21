package Introduction.oopconcepts;

import Introduction.Automobile.Cars;
import Introduction.Automobile.Fiat;
import Introduction.Automobile.Cars;

public class InheritanceDemo {

    public static void main (String[] args) {
        int speed = 0;
    Cars c1 = new Cars(speed);
    c1.increaseSpeed();
    //c1.decreaseSpeed();
    c1.putInReverse();
    c1.publicSpeed = 50;



        Fiat fiat1 = new Fiat(speed);
        fiat1.increaseSpeed();
        fiat1.headupDisplayNavigation();
        fiat1.putInReverse();
       // fiat1.decreaseSpeed();
        fiat1.openTopWindow();

    }
}
