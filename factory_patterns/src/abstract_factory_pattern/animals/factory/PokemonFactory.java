package abstract_factory_pattern.animals.factory;

import abstract_factory_pattern.animals.animals.IAnimals;
import abstract_factory_pattern.animals.animals.PokemonAnimals;
import abstract_factory_pattern.animals.characters.ICaretakers;
import abstract_factory_pattern.animals.characters.PokemonCaretakers;

public class PokemonFactory implements IFactory
{
    @Override
    public IAnimals getAnimals()
    {
        return new PokemonAnimals();
    }

    @Override
    public ICaretakers getCareTakers()
    {
        return new PokemonCaretakers();
    }
}
