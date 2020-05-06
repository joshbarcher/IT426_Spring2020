package orders;

import observer.Observable;

import java.util.HashSet;
import java.util.Set;

public class OrderSystem extends Observable
{
    private Set<Order> orders;

    public OrderSystem()
    {
        orders = new HashSet<>();
    }

    public void placeOrder(Order newOrder)
    {
        if (orders.stream().noneMatch(order -> order.getId() == newOrder.getId()))
        {
            orders.add(newOrder);
            notifyObservers("Order placed: #" + newOrder.getId());
        }
    }
}
