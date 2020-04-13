package builder;

import java.time.LocalDate;

public class TestBuilder
{
    public static void main(String[] args)
    {
        Note note = new NoteBuilder()
            .author("Josh")
            .message("Wash the dishes")
            .created(LocalDate.now())
            .build();

        System.out.println(note);
    }
}
