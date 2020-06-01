package abstract_factory_pattern.animals.factory;

import abstract_factory_pattern.animals.animals.IAnimals;
import abstract_factory_pattern.animals.characters.ICaretakers;

public interface IFactory
{
    IAnimals getAnimals();
    ICaretakers getCareTakers();
}
