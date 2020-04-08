package edu.greenriver.it.messagingapp.repositories;

import edu.greenriver.it.messagingapp.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMessagesRepository extends CrudRepository<Message, Integer>
{
    //we automatically get CREATE, READ, UPDATE and DELETE
    Iterable<Message> findMessageByAuthorContains(String subString);
}
