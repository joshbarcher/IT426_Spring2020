package abstract_factory_pattern.animals.test;

import abstract_factory_pattern.animals.animals.IAnimals;
import abstract_factory_pattern.animals.characters.ICaretakers;
import abstract_factory_pattern.animals.entities.Animal;
import abstract_factory_pattern.animals.entities.Caretaker;
import abstract_factory_pattern.animals.factory.IFactory;
import abstract_factory_pattern.animals.factory.PokemonFactory;
import abstract_factory_pattern.animals.factory.ZooFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestFactory
{
    public static void main(String[] args)
    {
        //get the objects I need from a factory
        IFactory factory = new PokemonFactory(); //new ZooFactory();

        //print the animals in the program
        IAnimals animals = factory.getAnimals();
        List<Animal> animalsList = animals.getAnimals();

        for (int i = 0; i < animalsList.size(); i++)
        {
            Animal animal = animalsList.get(i);

            System.out.print(animal.getName() + " - ");
            System.out.println(Arrays.toString(animal.getCharacteristics()));
        }
        System.out.println();

        //print the caretakers in the program
        ICaretakers caretakers = factory.getCareTakers();
        Map<String, Caretaker> caretakerMap = caretakers.getAllCharacters();

        for (String name : caretakerMap.keySet())
        {
            Caretaker caretaker = caretakerMap.get(name);
            System.out.print(caretaker.getFullName() + " - ");
            System.out.println(caretaker.getPosition());
        }
    }
}
