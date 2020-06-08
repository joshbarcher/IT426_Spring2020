package composite.shapes.primitives;

import composite.shapes.IDrawable;

public class Line implements IDrawable
{
    private double x, y;

    public Line(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    @Override
    public void draw()
    {
        System.out.println("Line: " + x + ", " + y);
    }
}
