package points.adapter;

import points.point.I3DPoint;
import points.point.ICartesianPoint;
import points.point.Point2D;

public class Point2DAdapter implements I3DPoint
{
    //store the adaptee
    private ICartesianPoint point;

    public Point2DAdapter(ICartesianPoint point)
    {
        this.point = point;
    }

    //use the adaptee to fulfill the interface contract

    @Override
    public double getX()
    {
        return point.getX();
    }

    @Override
    public double getY()
    {
        return point.getY();
    }

    @Override
    public double getZ()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
