package facade;

import shapes.basic.BaseShape;
import shapes.basic.ShapeType;
import subsystems.CreateShapes;

import java.util.Map;

public class ShapesFacade
{
    private Map<ShapeType, Integer> numDims = Map.of(
        ShapeType.ELLIPSE, 2,
        ShapeType.RECTANGLE, 2,
        ShapeType.LINE, 4,
        ShapeType.CIRCLE, 1,
        ShapeType.SQUARE, 1,
        ShapeType.POINT, 2
    );

    public BaseShape generateShape(ShapeType type, double... dims)
    {
        if (dims.length != numDims.get(type))
        {
            throw new IllegalArgumentException("Dimensions don't match the shape");
        }

        //access the subsystem
        CreateShapes creator = new CreateShapes();
        switch(type)
        {
            case ELLIPSE: return creator.generateEllipse(dims[0], dims[1]);
            case RECTANGLE: return creator.generateRectangle(dims[0], dims[1]);
            case LINE: return creator.generateLine(dims[0], dims[1], dims[2], dims[3]);
            case CIRCLE: return creator.generateCircle(dims[0]);
            case SQUARE: return creator.generateSquare(dims[0]);
            case POINT: return creator.generatePoint(dims[0], dims[1]);
        }
        throw new IllegalArgumentException("Shape type not found");
    }
}
