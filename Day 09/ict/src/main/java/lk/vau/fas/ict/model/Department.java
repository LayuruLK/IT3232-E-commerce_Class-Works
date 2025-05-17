package lk.ac.vau.fas.ict.model;

import jakarta.persistence.*;
import java.util.List;

@Entity(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long DepId;
    private String DName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;
    
    private String Location;

    public Department() {}
    
    public Department(Long DepId, String DName, String Location) {
    	this.DepId = DepId;
    	this.DName = DName;
    	this.Location = Location;
    }

	public Department(Long DepId, String DName, List<Employee> employees, String location) {
		super();
		this.DepId = DepId;
		this.DName = DName;
		this.employees = employees;
		this.Location = location;
	}

	public Long getDepId() {
		return DepId;
	}

	public void setDepId(Long DepId) {
		this.DepId = DepId;
	}

	public String getDName() {
		return DName;
	}

	public void setDName(String DName) {
		this.DName = DName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String Location) {
		this.Location = Location;
	}
    
}
