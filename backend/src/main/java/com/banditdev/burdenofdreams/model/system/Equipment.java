package com.banditdev.burdenofdreams.model.system;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number;
    private String name;

    @ManyToMany(mappedBy = "equipment")
    private List<Activity> activity = new ArrayList<>();

    @ManyToMany(mappedBy = "reservedEquipment")
    private List<Session> sessions = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private Status status;

    public Equipment(int number, String name, List<Activity> activity, List<Session> sessions, Status status) {
        this.number = number;
        this.name = name;
        this.activity = activity;
        this.sessions = sessions;
        this.status = status;
    }

    public Equipment() {
    }

    public Long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivity() {
        return activity;
    }

    public void setActivity(List<Activity> activity) {
        this.activity = activity;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
