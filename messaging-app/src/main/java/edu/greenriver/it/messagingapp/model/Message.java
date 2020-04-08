package edu.greenriver.it.messagingapp.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

//lombok annotations
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

//JPA annotations
@Entity
public class Message
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String author;
    private String body;
    private LocalDate posted;
}
