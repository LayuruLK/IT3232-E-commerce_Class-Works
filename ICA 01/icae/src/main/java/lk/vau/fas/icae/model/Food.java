package lk.vau.fas.icae.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Food {
    @Id
    private int id;

    private String name;
    private double price;
    private double weight;
}
