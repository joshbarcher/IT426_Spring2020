package composite.test;

import composite.shapes.IDrawable;
import composite.shapes.composite.CompositeShape;
import composite.shapes.primitives.Circle;
import composite.shapes.primitives.Line;
import composite.shapes.primitives.Rectangle;

public class TestShapes
{
    public static void main(String[] args)
    {
        CompositeShape drawing = new CompositeShape(new IDrawable[] {
            new Circle(10),
            new Line(1, 2),
            new CompositeShape(new IDrawable[] {
                new Rectangle(4, 19),
                new Rectangle(19, 4),
                new CompositeShape(new IDrawable[] {
                    new Circle(10),
                    new Circle(3),
                    new Circle(3),
                    new Line(5, 15)
                })
            })
        });

        drawing.draw();
    }
}
