package pizzeria.interfaces;

public interface IPizza {
    public int getSize();

    public double getCost();

    public int addTopping(ITopping topping);

    public int getTimeToMake();
}
