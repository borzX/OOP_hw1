import java.util.ArrayList;
import java.util.List;

public class HotBeverageAvtomat implements VendingMachine {
    List<HotBeverage> hotBeveragesList;

    public List<HotBeverage> getHotBeveragesList() {
        return hotBeveragesList;
    }

    public void setHotBeveragesList(List<HotBeverage> hotBeveragesList) {
        this.hotBeveragesList = hotBeveragesList;
    }

    public HotBeverageAvtomat(List<HotBeverage> hotBeveragesList) {
        this.hotBeveragesList = hotBeveragesList;
    }

    public HotBeverage getBeverege(String name, int temperature) {
        for (HotBeverage hotBeverage : hotBeveragesList) {
            if (hotBeverage.getName().equals(name) && hotBeverage.getTemperature() == temperature) {
                return hotBeverage;
            }
        }
        return null;
    }

    @Override
    public Beverage getBeverage(String name) {
        for (Beverage beverage : hotBeveragesList) {
            if (beverage.getName().equals(name)) {
                return beverage;
            }
        }
        return null;
    }

        public void addHotBeverage(HotBeverage HotBeverage){
            this.hotBeveragesList.add(HotBeverage);
        }

}
