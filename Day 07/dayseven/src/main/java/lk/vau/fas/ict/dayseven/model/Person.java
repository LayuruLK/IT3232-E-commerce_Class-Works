package lk.vau.fas.ict.dayseven.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
    private String email;
    private String gender;
    private String name;
    private long phone;

    public Person() {
        super();
    }

    public Person(String email, String gender, String name, long phone) {
        super();
        this.email = email;
        this.gender = gender;
        this.name = name;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    
}
