package edu.greenriver.it.didemo.model.shelves;

import edu.greenriver.it.didemo.model.books.Book;

public interface IBookShelf
{
    void add(Book book);
    void remove(Book book);
    boolean contain(Book book);
}
