package edu.greenriver.it.didemo.model.shelves;

import edu.greenriver.it.didemo.model.books.Book;
import org.springframework.stereotype.Component;

@Component
public class DigitalBookShelf implements IBookShelf
{
    @Override
    public void add(Book book)
    {

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
