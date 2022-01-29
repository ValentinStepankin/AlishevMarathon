package day5and6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getFuel() {
        return fuel;
    }

    void info(){
        System.out.println("Изготовитель: "+producer+
                ", год выпуска: "+year+
                ", длина: "+length+
                ", вес: "+weight+
                ", количество топлива в баке: "+fuel);
    }

    void  fillUp(int dimension){
        this.fuel = fuel + dimension;
    }
}
