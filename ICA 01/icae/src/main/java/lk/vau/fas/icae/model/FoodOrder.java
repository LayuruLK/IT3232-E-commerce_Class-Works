package lk.vau.fas.icae.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class FoodOrder {
    @Id
    private int id;

    private LocalDate date;
}
