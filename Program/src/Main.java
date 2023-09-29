import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<HotBeverage> hotBevList = new ArrayList<>();
        hotBevList.add(new HotBeverage("Late",150,10, 90));
        hotBevList.add(new HotBeverage("chocolate", 250,25, 80));
        hotBevList.add(new HotBeverage("blackTea", 150, 15, 95));

        HotBeverageAvtomat vendMach = new HotBeverageAvtomat(hotBevList);

        System.out.println(vendMach.getBeverage("Late"));
        System.out.println(vendMach.getBeverage("chocolate"));
        System.out.println(vendMach.getBeverage("blackTea"));

    }
}