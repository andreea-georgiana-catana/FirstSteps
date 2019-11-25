package Introduction.oopconcepts;

public class ClassDemo {

    public static void main(String[] args){
        Car nissan = new Car();
        nissan.setBrand("Nissan");
        System.out.println("Brand of nissan is: " + nissan.getBrand());

        System.out.println("Model of nissan is: " + nissan.getModel());

        Car micra = new Car();
        micra.setModel("Micra");
        System.out.println("Model of nissan is: " + micra.getModel());

        micra.setModel("500");
        System.out.println("Model of micra is: " + micra.getModel());

        micra.setYear(1980);
        System.out.println("Year of micra is: " + micra.getYear());

    }
}
