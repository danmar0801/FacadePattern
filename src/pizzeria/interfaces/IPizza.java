package pizzeria.interfaces;

public interface IPizza {
    public int getSize();

    public double getCost();

    public void addTopping(ITopping topping);

    public double getTimeToMake();
}
