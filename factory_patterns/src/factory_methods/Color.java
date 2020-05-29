package factory_methods;

import java.util.Random;

public class Color
{
    //components will be in the range [0,255]
    private int red;
    private int green;
    private int blue;

    //this will always lie between [0, 1]
    //where 0 means transparent and 1 opaque
    private double alpha;

    private Color(int red, int green, int blue,
                 double alpha)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public static Color random()
    {
        Random random = new Random();

        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        return new Color(red, green, blue, 1.0);
    }

    public static Color shadeOfGreen()
    {
        Random random = new Random();
        int green = random.nextInt(256);
        return new Color(0, green, 0, 1.0);
    }

    public static Color grayscale(int component)
    {
        return new Color(component, component, component, 1.0);
    }

    public double getRed()
    {
        return red;
    }

    public double getGreen()
    {
        return green;
    }

    public double getBlue()
    {
        return blue;
    }

    public double getAlpha()
    {
        return alpha;
    }

    @Override
    public String toString()
    {
        return "(" + red + "," + green + "," + blue + "," +
                ((int) ((alpha / 1.0) * 100)) + "%)";
    }
}
