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

    @ManyToMany(mappedBy = "reservedEquipment")
    private List<Session> sessions = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private Status status;

    public Equipment(Long id, int number, String name, List<Session> sessions, Status status) {
        this.id = id;
        this.number = number;
        this.name = name;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
