package Introduction;

import Introduction.Automobile.*;

public class Nissan extends Cars {

    public void increaseNissanSpeed() {
        Cars c1 = new Cars();
        c1.publicSpeed = 30;
        c1.setPrivateSpeed(50);
        protectedSpeed = 40;
    }
}
