package points.test;

import points.adapter.Point2DAdapter;
import points.adapter.Point3DAdapter;
import points.plane.Plane2D;
import points.plane.Plane3D;
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
        System.out.println();

        //new target system
        Plane3D plane3D = new Plane3D();
        plane3D.add(point);
        plane3D.printPlane();
        System.out.println();

        points.stream().forEach(p -> {
            plane3D.add(new Point2DAdapter(p));
        });
        plane3D.printPlane();
    }
}
