package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setReleaseDate(1967);
        car.setColor("Black");
        car.setModel("Chevrolet Impala");
        System.out.println(car.getReleaseDate()+" "+car.getModel());
        System.out.println("Color: "+car.getColor());

    }
}
