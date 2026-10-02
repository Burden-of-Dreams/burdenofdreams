package com.banditdev.burdenofdreams.model.system.dto;

import com.banditdev.burdenofdreams.model.system.Activity;

import java.util.List;

public class ActivityDTO {

    private long id;
    private String name;
    private String description;

    private List<Long> employeeIds;

    private int ageLimit;
    private int capacity;
    private int durationMinutes;

    private List<Long> equipmentIds;

    private double pricePerActivity;
    private double pricePerPerson;

    public ActivityDTO() {
    }

    public ActivityDTO(Long id,
                       String name,
                       String description,
                       List<Long> employeeIds,
                       int ageLimit,
                       int capacity,
                       int durationMinutes,
                       List<Long> equipmentIds,
                       double pricePerActivity,
                       double pricePerPerson) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.employeeIds = employeeIds;
        this.ageLimit = ageLimit;
        this.capacity = capacity;
        this.durationMinutes = durationMinutes;
        this.equipmentIds = equipmentIds;
        this.pricePerActivity = pricePerActivity;
        this.pricePerPerson = pricePerPerson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Long> getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(List<Long> employeeIds) {
        this.employeeIds = employeeIds;
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

    public List<Long> getEquipmentIds() {
        return equipmentIds;
    }

    public void setEquipmentIds(List<Long> equipmentIds) {
        this.equipmentIds = equipmentIds;
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

