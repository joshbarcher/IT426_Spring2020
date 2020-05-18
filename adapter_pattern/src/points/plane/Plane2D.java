package points.plane;

import points.point.ICartesianPoint;

import java.util.ArrayList;
import java.util.List;

public class Plane2D
{
    private List<ICartesianPoint> points;

    public Plane2D()
    {
        points = new ArrayList<>();
    }

    public void add(ICartesianPoint point)
    {
        points.add(point);
    }

    public void printPlane()
    {
        points.stream().forEach(System.out::println);
    }
}
