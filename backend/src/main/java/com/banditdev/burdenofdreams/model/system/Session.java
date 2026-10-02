package com.banditdev.burdenofdreams.model.system;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Activity typeOfActivity;

    private int amountOfCustomers;

    @ManyToMany
    private List<Equipment> reservedEquipment = new ArrayList<>();

    private LocalDate dateOfActivity;
    private LocalTime startOfSession;
    private LocalTime endOfSession;

    @ManyToOne
    private Booking booking;


    public Session(Activity typeOfActivity, int amountOfCustomers, List<Equipment> reservedEquipment,
                   LocalDate dateOfActivity, LocalTime startOfSession,
                   LocalTime endOfSession, Booking booking) {

        this.typeOfActivity = typeOfActivity;
        this.amountOfCustomers = amountOfCustomers;
        this.reservedEquipment = reservedEquipment;
        this.dateOfActivity = dateOfActivity;
        this.startOfSession = startOfSession;
        this.endOfSession = endOfSession;
        this.booking = booking;
    }

    public Session() {
    }

    public Long getId() {
        return id;
    }

    public Activity getTypeOfActivity() {
        return typeOfActivity;
    }

    public void setTypeOfActivity(Activity typeOfActivity) {
        this.typeOfActivity = typeOfActivity;
    }

    public int getAmountOfCustomers() {
        return amountOfCustomers;
    }

    public void setAmountOfCustomers(int amountOfCustomers) {
        this.amountOfCustomers = amountOfCustomers;
    }

    public List<Equipment> getReservedEquipment() {
        return reservedEquipment;
    }

    public void setReservedEquipment(List<Equipment> reservedEquipment) {
        this.reservedEquipment = reservedEquipment;
    }

    public LocalDate getDateOfActivity() {
        return dateOfActivity;
    }

    public void setDateOfActivity(LocalDate dateOfActivity) {
        this.dateOfActivity = dateOfActivity;
    }

    public LocalTime getStartOfSession() {
        return startOfSession;
    }

    public void setStartOfSession(LocalTime startOfSession) {
        this.startOfSession = startOfSession;
    }

    public LocalTime getEndOfSession() {
        return endOfSession;
    }

    public void setEndOfSession(LocalTime endOfSession) {
        this.endOfSession = endOfSession;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
