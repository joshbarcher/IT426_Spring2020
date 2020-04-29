package driver;

import entities.Document;
import entities.Runner;
import race.Race;
import strategies.registration.FallRegistration;
import strategies.registration.OpenRegistration;

import java.time.LocalDate;
import java.util.Arrays;

public class TestClasses
{
    public static void main(String[] args)
    {
        Runner[] runners = {
            new Runner("Stan Williams",
                Arrays.asList(new Document("Winter Registration"))),
            new Runner("Michelle Smith",
                Arrays.asList(new Document("Fall Registration"),
                              new Document("Liability Waiver"))),
            new Runner("Tyler Patrick",
                Arrays.asList(new Document("Winter Registration"))),
            new Runner("Jean Davis",
                Arrays.asList(new Document("Winter Registration"))),
            new Runner("Susie Brown",
                Arrays.asList(new Document("Fall Registration"))),
            new Runner("Terry Wilson",
                Arrays.asList(new Document("Fall Registration"),
                              new Document("Liability Waiver")))
        };

        Race fallRace = new Race("Breast Cancer Awareness Run", LocalDate.now(),
                new OpenRegistration());

        //register each of the runners above
        Arrays.stream(runners).forEach(fallRace::register);
        fallRace.raceDay();
    }
}
