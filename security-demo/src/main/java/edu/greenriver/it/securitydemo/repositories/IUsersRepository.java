package edu.greenriver.it.securitydemo.repositories;

import edu.greenriver.it.securitydemo.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersRepository extends CrudRepository<User, Integer>
{
    User findByUsernameEquals(String username);
}
