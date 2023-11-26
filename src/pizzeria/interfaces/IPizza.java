package pizzeria.interfaces;

public interface IPizza {
    int getSize();

    double getCost();

    void addTopping(ITopping topping);

    double getTimeToMake();
}
