public interface VendingMachine {
    Beverage getBeverage(String name) throws IllegalStateException;
}
