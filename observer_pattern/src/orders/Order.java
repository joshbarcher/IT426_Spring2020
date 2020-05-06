package orders;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    private long id;
    private List<LineItem> items;

    public Order(long id, List<LineItem> items)
    {
        this.id = id;
        this.items = items;
    }

    public long getId()
    {
        return id;
    }

    public List<LineItem> getItems()
    {
        return items;
    }
}
