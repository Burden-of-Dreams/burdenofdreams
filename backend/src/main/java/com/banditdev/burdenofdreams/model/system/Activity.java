package com.banditdev.burdenofdreams.model.system;

import com.banditdev.burdenofdreams.model.user.Employee;

public class Activity {
    private long id;
    private String name;
    private String description;
    private Employee employees;
    private int ageLimit;
    private int capacity;
    private int durationMinutes;
    private Equipment equipment;
    private double pricePerActivity;
    private double pricePerPerson;
}
