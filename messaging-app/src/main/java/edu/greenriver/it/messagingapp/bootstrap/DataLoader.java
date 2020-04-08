package edu.greenriver.it.messagingapp.bootstrap;

import edu.greenriver.it.messagingapp.model.Message;
import edu.greenriver.it.messagingapp.repositories.IMessagesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Slf4j
@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent>
{
    private IMessagesRepository repo;

    public DataLoader(IMessagesRepository repo)
    {
        this.repo = repo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {
        //this method will execute when our app is ready to run
        Message msg1 = Message.builder()
            .author("hello_kitty_119")
            .body("Star wars is overrated, seriously")
            .posted(LocalDate.now())
            .build();

        Message msg2 = Message.builder()
                .author("forum_ninja")
                .body("I can't stand youtube anymore!")
                .posted(LocalDate.now())
                .build();

        Message msg3 = Message.builder()
                .body("Sniff, sniff, stop it!!!")
                .posted(LocalDate.now())
                .author("internet tough guy")
                .build();

        repo.save(msg1);
        repo.save(msg2);
        repo.save(msg3);

        log.info("Dummy DB records loaded");
    }
}












