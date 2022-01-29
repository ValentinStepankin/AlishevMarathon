package day5and6;

public class Car {
    private int releaseDate;
    private String color;
    private String model;

    void info(){
        System.out.println("Это автомобиль");
    }

    String yearDifference(int year){
        return "Возраст(лет): " + (year - releaseDate);
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
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
}
