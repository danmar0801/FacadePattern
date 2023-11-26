package pizzeria.interfaces;

public interface IWorker {
    void startJob(IOrder order);

    void onJobEnd(IOrder order);
}
