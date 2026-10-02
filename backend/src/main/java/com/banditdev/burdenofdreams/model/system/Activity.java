package com.banditdev.burdenofdreams.model.system;

import com.banditdev.burdenofdreams.model.user.Employee;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany  //skal måske ændress til en manyToMany hvis hver employee kan lave flere forskellige aktiviteter.
    private List<Employee> employees = new ArrayList<>();

    private int ageLimit;
    private int capacity;
    private int durationMinutes;

    @ManyToMany
    private List<Equipment> equipment = new ArrayList<>();


    private double pricePerActivity;
    private double pricePerPerson;

    public Activity(String name, String description, List<Employee> employees,
                    int ageLimit, int capacity, int durationMinutes, List<Equipment> equipment,
                    double pricePerActivity, double pricePerPerson) {

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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
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
