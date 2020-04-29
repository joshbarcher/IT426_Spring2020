package strategies.registration;

import entities.Document;
import entities.Runner;

import java.util.Set;
import java.util.stream.Collectors;

public class FallRegistration implements IRegistration
{
    @Override
    public Set<Runner> validate(Set<Runner> runners)
    {
        Document doc = new Document("Fall Registration");

        //filter our runners without the doc
        return runners.stream()
            .filter(runner -> {
                return runner.getDocuments().contains(doc);
            })
            .collect(Collectors.toSet());
    }
}
