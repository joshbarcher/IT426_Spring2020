package edu.greenriver.it.didemo.model.shelves;

import edu.greenriver.it.didemo.model.books.Book;
import org.springframework.stereotype.Component;

@Component
public class WoodenBookShelf implements IBookShelf
{
    @Override
    public void add(Book book)
    {
        System.out.println("Added book to shelf");
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
