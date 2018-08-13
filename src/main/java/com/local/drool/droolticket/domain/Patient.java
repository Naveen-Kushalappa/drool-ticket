package com.local.drool.droolticket.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "patient_details")
public class Patient {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name="areaId")
    private Integer areaId;

    @Column(name="isAssignable")
    private boolean isAssignable;

    public boolean isAssignable() {
        return isAssignable;
    }

    public void setIsAssignable(boolean isAssignable) {
        this.isAssignable = isAssignable;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAreaId() {
        return areaId;
    }


}
