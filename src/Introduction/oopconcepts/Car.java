package Introduction.oopconcepts;

public class Car {
    //color
    private String color;
    //brand
    private String brand;
    int speed;
    int gear;
    //model
    private String model;
    //year
    private int year;

    public Car() {
        this(10, 2);
        this.speed = 0;
        this.gear = 0;
        System.out.println("Executing constructor without arguments");
    }

    public Car(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        System.out.println("Executing constructor with arguments");

    }

    public void increaseSpeed(){
        System.out.println("Increase the speed");
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1990){
            this.year = year;
        }else{
            System.out.println("This year is not valid");
        }

    }
}


