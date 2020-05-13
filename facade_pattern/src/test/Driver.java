package test;

import facade.ShapesFacade;
import shapes.basic.Ellipse;
import shapes.basic.Line;
import shapes.basic.Rectangle;
import shapes.basic.ShapeType;

public class Driver
{
    public static void main(String[] args)
    {
        ShapesFacade facade = new ShapesFacade();

        Ellipse circle = (Ellipse)facade.generateShape(ShapeType.CIRCLE, 2);
        Rectangle rect = (Rectangle)facade.generateShape(ShapeType.RECTANGLE, 6, 14);
        Line line = (Line)facade.generateShape(ShapeType.LINE, 6, 14, 2, 3);

        System.out.println(circle);
        System.out.println(rect);
        System.out.println(line);
    }
}
