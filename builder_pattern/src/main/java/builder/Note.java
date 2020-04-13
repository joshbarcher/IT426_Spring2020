package builder;

import java.time.LocalDate;
import java.util.UUID;

public class Note
{
    private UUID id;
    private String author;
    private String message;
    private LocalDate created;

    public Note(String author,
                String message, LocalDate created)
    {
        this.id = UUID.randomUUID();
        this.author = author;
        this.message = message;
        this.created = created;
    }

    public UUID getId()
    {
        return id;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getMessage()
    {
        return message;
    }

    public LocalDate getCreated()
    {
        return created;
    }

    @Override
    public String toString()
    {
        return "Note{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", message='" + message + '\'' +
                ", created=" + created +
                '}';
    }
}
