package lk.vau.fas.icae.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderLine {
    @Id
    private int id;

    private int quantity;
}
