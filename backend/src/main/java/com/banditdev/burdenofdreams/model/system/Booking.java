package com.banditdev.burdenofdreams.model.system;



import jakarta.persistence.*;
import org.hibernate.annotations.Audited;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;


@Entity
@Audited.Table(name = "Booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nameOfCustomer;
    private String phoneNumber;
    private String emailOfCustomer;

@OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<Session> sessions;
    private Date date;
    private double totalPrice;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Booking{" +
                "id=" + id +
                ", nameOfCustomer='" + nameOfCustomer + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailOfCustomer='" + emailOfCustomer + '\'' +
                ", sessions=" + sessions +
                ", date=" + date +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
