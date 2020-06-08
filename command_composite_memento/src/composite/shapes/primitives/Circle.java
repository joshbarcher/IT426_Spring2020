package composite.shapes.primitives;

import composite.shapes.IDrawable;

public class Circle implements IDrawable
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    @Override
    public void draw()
    {
        System.out.println("Circle: " + radius);
    }
}
