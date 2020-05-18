package points.adapter;

import points.point.ICartesianPoint;
import points.point.Point3D;

public class Point3DAdapter implements ICartesianPoint
{
    //store the adaptee
    private Point3D point;

    public Point3DAdapter(Point3D point)
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
    public String toString()
    {
        return "(" + getX() + ", " + getY() + ")";
    }
}
