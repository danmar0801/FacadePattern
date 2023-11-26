package pizzeria.workers;

import pizzeria.interfaces.IOrder;
import pizzeria.interfaces.IWorker;

public class OrderTaker implements IWorker {
    public void startJob(IOrder order) {
        System.out.println("Order is being processed...");
    }

    public void onJobEnd(IOrder order) {
        System.out.println("Order processing is complete.");
    }
}
