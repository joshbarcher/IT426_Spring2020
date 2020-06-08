package composite.shapes.primitives;

import composite.shapes.IDrawable;

public class Rectangle implements IDrawable
{
    private double width, length;

    public Rectangle(double x, double y)
    {
        this.width = x;
        this.length = y;
    }

    public double getWidth()
    {
        return width;
    }

    public double getLength()
    {
        return length;
    }

    @Override
    public void draw()
    {
        System.out.println("Rectangle: " + width + ", " + length);
    }
}
