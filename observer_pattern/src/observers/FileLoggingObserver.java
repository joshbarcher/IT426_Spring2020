package observers;

import observer.IObserver;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLoggingObserver implements IObserver
{
    @Override
    public void update(Object[] changes)
    {
        try (PrintWriter writer = new PrintWriter(
                new FileWriter("log.txt", true)))
        {
            for (Object change : changes)
            {
                writer.println(change);
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
