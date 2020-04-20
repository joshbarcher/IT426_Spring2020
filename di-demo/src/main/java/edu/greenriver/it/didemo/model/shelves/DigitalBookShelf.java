package edu.greenriver.it.didemo.model.shelves;

import edu.greenriver.it.didemo.model.books.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("digital")
public class DigitalBookShelf implements IBookShelf
{
    @Override
    public void add(Book book)
    {
        System.out.println("Added to digital shelf");
    }

    @Override
    public void remove(Book book)
    {

    }

    @Override
    public boolean contain(Book book)
    {
        return false;
    }
}
