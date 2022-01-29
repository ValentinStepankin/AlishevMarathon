package day5and6;

public class Motorbike {
    private int releaseDate;
    private String color;
    private String model;

    void info(){
        System.out.println("Это мотоцикл");
    }

    String yearDifference(int year){
        return "Возраст(лет): " + (year - releaseDate);
    }

    public Motorbike(int releaseDate, String color, String model) {
        this.releaseDate = releaseDate;
        this.color = color;
        this.model = model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
