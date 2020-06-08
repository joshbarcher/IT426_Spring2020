package composite.shapes.composite;

import composite.shapes.IDrawable;

public class CompositeShape implements IDrawable
{
    private IDrawable[] drawables;

    public CompositeShape(IDrawable[] drawables)
    {
        this.drawables = drawables;
    }

    @Override
    public void draw()
    {
        for (int i = 0; i < drawables.length; i++)
        {
            drawables[i].draw();
        }
    }
}
