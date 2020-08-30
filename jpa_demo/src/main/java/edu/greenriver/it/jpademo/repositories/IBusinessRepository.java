package edu.greenriver.it.jpademo.repositories;

import edu.greenriver.it.jpademo.entities.Business;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBusinessRepository extends CrudRepository<Business, Integer>
{
}
