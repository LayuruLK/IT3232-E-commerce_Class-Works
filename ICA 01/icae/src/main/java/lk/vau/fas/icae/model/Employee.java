package lk.vau.fas.icae.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee extends Person{
    private String jobPosition;

    @ManyToMany
    @JoinTable(name = "employee_canteen",
    joinColumns = @JoinColumn(name = "employee_id"),
    inverseJoinColumns = @JoinColumn(name = "canteen_id"))

    private List<Canteen> canteens;

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public List<Canteen> getCanteens() {
        return canteens;
    }

    public void setCanteens(List<Canteen> canteens) {
        this.canteens = canteens;
    }
}
