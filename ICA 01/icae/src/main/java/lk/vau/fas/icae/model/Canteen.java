package lk.vau.fas.icae.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Canteen {
    @Id
    private int id;

    private String location;
    
}
