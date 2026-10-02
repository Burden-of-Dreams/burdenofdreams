package com.banditdev.burdenofdreams.dto;

import java.time.LocalDate;
import java.util.List;

public class BookingDTO {

    private Long id;

    private String nameOfCustomer;
    private String phoneNumber;
    private String emailOfCustomer;

    private List<Long> sessionIds;

    private LocalDate date;

    private double totalPrice;

    public BookingDTO() {
    }

    public BookingDTO(
            Long id,
            String nameOfCustomer,
            String phoneNumber,
            String emailOfCustomer,
            List<Long> sessionIds,
            LocalDate date,
            double totalPrice
    ) {
        this.id = id;
        this.nameOfCustomer = nameOfCustomer;
        this.phoneNumber = phoneNumber;
        this.emailOfCustomer = emailOfCustomer;
        this.sessionIds = sessionIds;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Long> getSessionIds() {
        return sessionIds;
    }

    public void setSessionIds(List<Long> sessionIds) {
        this.sessionIds = sessionIds;
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
