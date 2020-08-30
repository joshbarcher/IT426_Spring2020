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
@Table(name="CakeInventory")
public class Cake
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cakeId;

    @Column(name="isFrosted")
    private boolean frosted;
    @Column(name="theFlavor")
    private String flavor;
    @Column(name="theIcing")
    private String icing;
    @Column(name="numberLayers")
    private int numLayers;
}
