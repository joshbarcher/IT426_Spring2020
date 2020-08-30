package edu.greenriver.it.jpademo.repositories;

import edu.greenriver.it.jpademo.entities.Cake;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICakeRepository extends CrudRepository<Cake, Integer>
{
    Optional<Cake> findCakeByFlavor(String flavor);
}

