public class HotBeverage extends Beverage {
    private int temperature;


    public HotBeverage(String name, int volume, double cost, int temperature) {
        super(name, volume, cost);
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "HotBeverage{"+
                "name=" + super.getName() +
                ", volume=" + super.getVolume() + "ml" +
                ", cost=" + super.getCost() + "руб." +
                ", temp=" + this.temperature + "C"+
                '}';
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotBeverage)) {
            return false;
        }

        HotBeverage that = (HotBeverage) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && super.getVolume() == that.getVolume()
                && getTemperature() == that.getTemperature();
    }
}
