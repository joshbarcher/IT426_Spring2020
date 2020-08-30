package edu.greenriver.it.jpademo.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;

    private String name;
    private String nickname;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;

    @OneToMany(mappedBy = "person")
    private List<PhoneNumber> numbers;

    @ManyToMany
    @JoinTable(
        name = "worksAt",
        joinColumns = @JoinColumn(name = "personId"),
        inverseJoinColumns = @JoinColumn(name = "businessId")
    )
    private List<Business> jobs;
}
