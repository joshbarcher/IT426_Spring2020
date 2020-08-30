package edu.greenriver.it.jpademo.repositories;

import edu.greenriver.it.jpademo.entities.Address;
import edu.greenriver.it.jpademo.entities.PhoneNumber;
import org.springframework.data.repository.CrudRepository;

public interface IPhoneNumberRepository extends CrudRepository<PhoneNumber, Integer>
{
}
