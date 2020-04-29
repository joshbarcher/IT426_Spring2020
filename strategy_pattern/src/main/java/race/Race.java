package race;

import entities.Runner;
import lombok.Data;
import strategies.registration.IRegistration;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Data
public class Race
{
    private String name;
    private LocalDate dayOfRace;
    private Set<Runner> runners = new HashSet<>();
    private IRegistration registration;

    public Race(String name, LocalDate dayOfRace,
                IRegistration registration)
    {
        this.name = name;
        this.dayOfRace = dayOfRace;
        this.registration = registration;
    }

    public void register(Runner runner)
    {
        runners.add(runner);
    }

    public void raceDay()
    {
        System.out.println("Welcome to the " + name + " race!");

        //use our interchangeable strategy
        runners = registration.validate(runners);
        runners.stream().forEach(runner -> {
            System.out.println("Running in race: " + runner.getName());
        });

        Runner winner = waitForWinner();
        System.out.println(winner.getName() + " wins the race!");
    }

    public Runner waitForWinner()
    {
        Random random = new Random();
        return runners.stream()
            .skip(random.nextInt(runners.size()))
            .findFirst()
            .get();
    }
}

