package edu.greenriver.it.jpademo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Business
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int businessId;

    private String name;

    @ManyToMany(mappedBy = "jobs")
    List<Person> employees;
}
