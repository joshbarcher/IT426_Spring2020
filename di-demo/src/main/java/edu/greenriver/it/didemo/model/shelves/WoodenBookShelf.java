package edu.greenriver.it.didemo.model.shelves;

import edu.greenriver.it.didemo.model.books.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("wooden")
public class WoodenBookShelf implements IBookShelf
{
    @Override
    public void add(Book book)
    {
        System.out.println("Added to wooden shelf");
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
