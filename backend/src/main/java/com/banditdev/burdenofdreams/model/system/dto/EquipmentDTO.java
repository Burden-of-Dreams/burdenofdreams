package com.banditdev.burdenofdreams.dto;

import com.banditdev.burdenofdreams.model.system.Status;

import java.util.List;

public class EquipmentDTO {

    private Long id;
    private int number;
    private String name;

    private List<Long> activityIds;
    private List<Long> sessionIds;

    private Status status;

    public EquipmentDTO() {
    }

    public EquipmentDTO(
            Long id,
            int number,
            String name,
            List<Long> activityIds,
            List<Long> sessionIds,
            Status status
    ) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.activityIds = activityIds;
        this.sessionIds = sessionIds;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Long> getActivityIds() {
        return activityIds;
    }

    public void setActivityIds(List<Long> activityIds) {
        this.activityIds = activityIds;
    }

    public List<Long> getSessionIds() {
        return sessionIds;
    }

    public void setSessionIds(List<Long> sessionIds) {
        this.sessionIds = sessionIds;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
