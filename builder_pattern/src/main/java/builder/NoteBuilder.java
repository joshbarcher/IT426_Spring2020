package builder;

import java.time.LocalDate;

public class NoteBuilder
{
    private String author;
    private String message;
    private LocalDate created;

    public NoteBuilder()
    {
        //do nothing...
    }

    public NoteBuilder author(String author)
    {
        this.author = author;
        return this;
    }

    public NoteBuilder message(String message)
    {
        this.message = message;
        return this;
    }

    public NoteBuilder created(LocalDate created)
    {
        this.created = created;
        return this;
    }

    public Note build()
    {
        return new Note(author, message, created);
    }
}
