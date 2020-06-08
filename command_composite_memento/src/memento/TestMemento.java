package memento;

public class TestMemento
{
    public static void main(String[] args)
    {
        Car car = new Car("Nissan", "Sentra", 100000, false);

        //snapshot the data
        Car.Memento memento = car.snapshot();

        //make some changes
        car.setModel("Rogue");
        car.setMiles(30000);

        System.out.println(car);

        //rollback
        car.rollback(memento);
        System.out.println(car);
    }
}
