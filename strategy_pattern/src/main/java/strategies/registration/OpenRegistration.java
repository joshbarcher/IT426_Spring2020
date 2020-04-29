package strategies.registration;

import entities.Runner;

import java.util.Set;

public class OpenRegistration implements IRegistration
{
    @Override
    public Set<Runner> validate(Set<Runner> runners)
    {
        return runners;
    }
}
