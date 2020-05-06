package orders;

public class LineItem
{
    private String type;
    private double value;
    private int quantity;

    public LineItem(String type, double value, int quantity)
    {
        this.type = type;
        this.value = value;
        this.quantity = quantity;
    }

    public String getType()
    {
        return type;
    }

    public double getValue()
    {
        return value;
    }

    public int getQuantity()
    {
        return quantity;
    }
}
