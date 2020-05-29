package factory_methods;

public class TestColors
{
    public static void main(String[] args)
    {
        //Color color = new Color(100, 100, 20, 0.5);

        //call my static factory methods
        Color random = Color.random();
        System.out.println(random);
        System.out.println(Color.shadeOfGreen());

        Color darkGray = Color.grayscale(50);
        System.out.println(darkGray);
    }
}
