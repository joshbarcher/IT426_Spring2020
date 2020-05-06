package driver;

import observers.ConsoleObserver;
import observers.FileLoggingObserver;
import orders.LineItem;
import orders.Order;
import orders.OrderSystem;

import java.util.List;

public class TestOrderingSystem
{
    public static void main(String[] args)
    {
        OrderSystem system = new OrderSystem();

        //create a few orders
        Order order1 = new Order(1, List.of(
            new LineItem("Fitness Watch", 99.99, 1),
            new LineItem("Socks", 3.99, 3)
        ));

        Order order2 = new Order(2, List.of(
            new LineItem("Headset", 39.99, 2)
        ));

        //connect observables to observers
        system.addObserver(new ConsoleObserver());
        system.addObserver(new FileLoggingObserver());

        //do something interesting
        system.placeOrder(order1);
        system.placeOrder(order2);
    }
}
