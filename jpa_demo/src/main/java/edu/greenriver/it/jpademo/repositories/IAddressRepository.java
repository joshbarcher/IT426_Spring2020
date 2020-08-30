package edu.greenriver.it.jpademo.repositories;

import edu.greenriver.it.jpademo.entities.Address;
import edu.greenriver.it.jpademo.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends CrudRepository<Address, Integer>
{
}
