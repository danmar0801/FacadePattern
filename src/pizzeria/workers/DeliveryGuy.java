package pizzeria.workers;

import pizzeria.interfaces.IOrder;
import pizzeria.interfaces.IWorker;

public class DeliveryGuy implements IWorker {
    public void startJob(IOrder order) {
        System.out.println("Delivering the pizza to the location...");
    }

    public void onJobEnd(IOrder order) {
        System.out.println("Pizza Delivered, might have run over a couple of children by mistake.");
    }
}
