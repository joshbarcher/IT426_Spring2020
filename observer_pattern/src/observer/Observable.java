package observer;

import java.util.ArrayList;
import java.util.List;

//our Observable objects will extend from this class
public abstract class Observable
{
    private List<IObserver> observers;

    public Observable()
    {
        observers = new ArrayList<>();
    }

    public void addObserver(IObserver observer)
    {
        if (!observers.contains(observer))
        {
            observers.add(observer);
        }
    }

    public void notifyObservers()
    {
        notifyObservers(new Object[0]);
    }

    public void notifyObservers(Object... changes)
    {
        for (IObserver observer : observers)
        {
            observer.update(changes);
        }
    }
}
