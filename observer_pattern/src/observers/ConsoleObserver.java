package observers;

import observer.IObserver;

public class ConsoleObserver implements IObserver
{
    @Override
    public void update(Object[] changes)
    {
        for (Object change : changes)
        {
            System.out.println(change);
        }
    }
}
