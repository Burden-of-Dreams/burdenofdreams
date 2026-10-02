package com.banditdev.burdenofdreams.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class SessionDTO {

    private Long id;

    private Long activityId;

    private int amountOfCustomers;

    private List<Long> equipmentIds;

    private LocalDate dateOfActivity;
    private LocalTime startOfSession;
    private LocalTime endOfSession;

    private Long bookingId;

    public SessionDTO() {
    }

    public SessionDTO(
            Long id,
            Long activityId,
            int amountOfCustomers,
            List<Long> equipmentIds,
            LocalDate dateOfActivity,
            LocalTime startOfSession,
            LocalTime endOfSession,
            Long bookingId
    ) {
        this.id = id;
        this.activityId = activityId;
        this.amountOfCustomers = amountOfCustomers;
        this.equipmentIds = equipmentIds;
        this.dateOfActivity = dateOfActivity;
        this.startOfSession = startOfSession;
        this.endOfSession = endOfSession;
        this.bookingId = bookingId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public int getAmountOfCustomers() {
        return amountOfCustomers;
    }

    public void setAmountOfCustomers(int amountOfCustomers) {
        this.amountOfCustomers = amountOfCustomers;
    }

    public List<Long> getEquipmentIds() {
        return equipmentIds;
    }

    public void setEquipmentIds(List<Long> equipmentIds) {
        this.equipmentIds = equipmentIds;
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

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }
}
