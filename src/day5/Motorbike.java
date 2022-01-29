package day5;

public class Motorbike {
    private int releaseDate;
    private String color;
    private String model;

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
