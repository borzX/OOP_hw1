public abstract class Beverage {
    private String name;
    private int volume;
    private double cost;

    public Beverage(String name, int volume, double cost) {
        this.name = name;
        this.volume = volume;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", cost=" + cost +
                '}';
    }
}
