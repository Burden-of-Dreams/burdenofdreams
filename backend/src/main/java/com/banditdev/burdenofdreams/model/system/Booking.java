package com.banditdev.burdenofdreams.model.system;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameOfCustomer;
    private String phoneNumber;
    private String emailOfCustomer;

    @OneToMany
    private List<Session> sessions = new ArrayList<>();

    private LocalDate date;
    private double totalPrice;

    public Booking(Long id, String nameOfCustomer, String phoneNumber, String emailOfCustomer, List<Session> sessions, LocalDate date, double totalPrice) {
        this.id = id;
        this.nameOfCustomer = nameOfCustomer;
        this.phoneNumber = phoneNumber;
        this.emailOfCustomer = emailOfCustomer;
        this.sessions = sessions;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailOfCustomer() {
        return emailOfCustomer;
    }

    public void setEmailOfCustomer(String emailOfCustomer) {
        this.emailOfCustomer = emailOfCustomer;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
