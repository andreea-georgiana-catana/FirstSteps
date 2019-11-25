import jdk.internal.module.SystemModuleFinder;

public class AplicatiaUnu {

    public static void main (String args[]) {
        if (args.length == 0)
            System.out.println("Aceasta este o aplicatie independenta");

        else {
            System.out.println("Argumentele pogramului sunt: ");
            for (int i = 0; i < args.length; i++)
                System.out.println(args[i]);
        }
    };
}
