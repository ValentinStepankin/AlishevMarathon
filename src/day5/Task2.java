package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(1935, "Black", "BMW R12");
        System.out.println(motorbike.getReleaseDate()+" "+motorbike.getModel());
        System.out.println("Color: "+motorbike.getColor());
    }
}
