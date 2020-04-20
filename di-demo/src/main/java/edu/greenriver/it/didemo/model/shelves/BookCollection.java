package edu.greenriver.it.didemo.model.shelves;

import edu.greenriver.it.didemo.model.books.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //this makes this class a spring bean
public class BookCollection
{
    //my collection needs (dependency) a shelf
    private IBookShelf shelf;

    //we need to inject our dependency here....
    public BookCollection(@Qualifier("wooden") IBookShelf shelf)
    {
        this.shelf = shelf;
    }

    public void add(Book book)
    {
        System.out.println("Added book to collection");

        shelf.add(book);
    }
}
