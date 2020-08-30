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
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    private int number;
    private String street;
    private String city;
    private String state;
    private int zip;

    @OneToOne(mappedBy = "address")
    private Person person;
}
