package points.test;

import points.adapter.Point3DAdapter;
import points.plane.Plane2D;
import points.point.ICartesianPoint;
import points.point.Point2D;
import points.point.Point3D;

import java.util.List;

public class DriverProgram
{
    public static void main(String[] args)
    {
        //compatible objects
        List<ICartesianPoint> points = List.of(
            new Point2D(1, 2),
            new Point2D(-4, 13),
            new Point2D(21, 7),
            new Point2D(0, 0)
        );

        //target system
        Plane2D plane = new Plane2D();
        points.stream().forEach(plane::add);
        plane.printPlane();
        System.out.println();

        //incompatible objects
        Point3D point = new Point3D(3, -17, 2);
        plane.add(new Point3DAdapter(point));
        plane.printPlane();
    }
}
