package day5and6;

public class Tasks {
    public static void main(String[] args) {
        Car car = new Car();
        car.setReleaseDate(1967);
        car.setColor("Black");
        car.setModel("Chevrolet Impala");
        System.out.println(car.getReleaseDate()+" "+car.getModel());
        System.out.println("Color: "+car.getColor());
        car.info();
        System.out.println(car.yearDifference(2015));

        System.out.println("----------------------");

        Motorbike motorbike = new Motorbike(1935, "Black", "BMW R12");
        System.out.println(motorbike.getReleaseDate()+" "+motorbike.getModel());
        System.out.println("Color: "+motorbike.getColor());
        motorbike.info();
        System.out.println(motorbike.yearDifference(2020));

        System.out.println("----------------------");

        Airplane airplane = new Airplane("Boeing", 1997, 40, 41410);
        System.out.println(airplane.getFuel());
        airplane.info();
        airplane.fillUp(6);
        System.out.println(airplane.getFuel());
        airplane.info();
    }
}
