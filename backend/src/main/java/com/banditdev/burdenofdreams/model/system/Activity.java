package com.banditdev.burdenofdreams.model.system;

import com.banditdev.burdenofdreams.model.user.Employee;
import jakarta.persistence.*;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToOne
    private Employee employees;

    private int ageLimit;
    private int capacity;
    private int durationMinutes;

    @ManyToOne
    private Equipment equipment;


    private double pricePerActivity;
    private double pricePerPerson;

    public Activity(Long id, String name, String description, Employee employees,
                    int ageLimit, int capacity, int durationMinutes, Equipment equipment,
                    double pricePerActivity, double pricePerPerson) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.employees = employees;
        this.ageLimit = ageLimit;
        this.capacity = capacity;
        this.durationMinutes = durationMinutes;
        this.equipment = equipment;
        this.pricePerActivity = pricePerActivity;
        this.pricePerPerson = pricePerPerson;
    }

    public Activity() {
        //Tom konstruktør
    }

    public long getId() {
        return id;
    }

    public Employee getEmployees() {
        return employees;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public double getPricePerActivity() {
        return pricePerActivity;
    }

    public void setPricePerActivity(double pricePerActivity) {
        this.pricePerActivity = pricePerActivity;
    }

    public double getPricePerPerson() {
        return pricePerPerson;
    }

    public void setPricePerPerson(double pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }
}
