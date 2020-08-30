package edu.greenriver.it.jpademo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PhoneNumber
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phoneNumberId;

    private int regionCode;
    private int areaCode;
    private int number;

    @ManyToOne
    @JoinColumn(name="personId")
    private Person person;
}
