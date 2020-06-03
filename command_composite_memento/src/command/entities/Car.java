package command.entities;

//the receiver object!
public class Car
{
    private String make;
    private String model;
    private int miles;
    private boolean working;

    public Car(String make, String model,
               int miles, boolean working)
    {
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.working = working;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getMiles()
    {
        return miles;
    }

    public void setMiles(int miles)
    {
        this.miles = miles;
    }

    public boolean isWorking()
    {
        return working;
    }

    public void setWorking(boolean working)
    {
        this.working = working;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", miles=" + miles +
                ", working=" + working +
                '}';
    }
}
