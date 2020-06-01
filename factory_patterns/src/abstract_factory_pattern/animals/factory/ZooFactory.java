package abstract_factory_pattern.animals.factory;

import abstract_factory_pattern.animals.animals.IAnimals;
import abstract_factory_pattern.animals.animals.ZooAnimals;
import abstract_factory_pattern.animals.characters.ICaretakers;
import abstract_factory_pattern.animals.characters.ZooCaretakers;

public class ZooFactory implements IFactory
{
    @Override
    public IAnimals getAnimals()
    {
        return new ZooAnimals();
    }

    @Override
    public ICaretakers getCareTakers()
    {
        return new ZooCaretakers();
    }
}
