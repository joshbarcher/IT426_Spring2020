package strategies.registration;

import entities.Document;
import entities.Runner;

import java.util.Set;
import java.util.stream.Collectors;

public class WinterRegistration implements IRegistration
{
    @Override
    public Set<Runner> validate(Set<Runner> runners)
    {
        Document winterReg = new Document("Winter Registration");
        Document liability = new Document("Liability Waiver");

        //filter our runners without the doc
        return runners.stream()
            .filter(runner -> {
                return runner.getDocuments().contains(winterReg) &&
                       runner.getDocuments().contains(liability);
            })
            .collect(Collectors.toSet());
    }
}
