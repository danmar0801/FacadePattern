package pizzeria.workers;

import pizzeria.interfaces.IOrder;
import pizzeria.interfaces.IWorker;

public class Oven implements IWorker {


    public void startJob(IOrder order) {
        System.out.println("Pizza is in the oven...");
    }

    public void onJobEnd(IOrder order) {
        System.out.println("Pizza is nice and toasty, just pulled out of the oven.");
    }
}
