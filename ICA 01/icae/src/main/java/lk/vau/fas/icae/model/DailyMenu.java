package lk.vau.fas.icae.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DailyMenu {
    @Id
    private int id;

    private LocalDate date;
}
