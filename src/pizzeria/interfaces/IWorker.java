package pizzeria.interfaces;

public interface IWorker {
    public void startJob(IOrder order);

    public void onJobEnd(IOrder order);
}
