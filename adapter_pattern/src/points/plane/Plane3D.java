package points.plane;

import points.point.I3DPoint;
import points.point.ICartesianPoint;

import java.util.ArrayList;
import java.util.List;

public class Plane3D
{
    private List<I3DPoint> points;

    public Plane3D()
    {
        points = new ArrayList<>();
    }

    public void add(I3DPoint point)
    {
        points.add(point);
    }

    public void printPlane()
    {
        points.stream().forEach(System.out::println);
    }
}
