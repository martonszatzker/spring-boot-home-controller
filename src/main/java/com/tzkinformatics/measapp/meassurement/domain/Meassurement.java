package com.tzkinformatics.measapp.meassurement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Meassurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String location;
    private String cru;
    private Date   crd;

    public Meassurement() {
    }

    public Meassurement(String measType, String location, String cru, Date crd) {
        this.type = measType;
        this.location = location;
        this.cru = cru;
        this.crd = crd;
    }

    public Meassurement(String type, String location) {

        this.type = type;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCru() {
        return cru;
    }

    public void setCru(String cru) {
        this.cru = cru;
    }

    public Date getCrd() {
        return crd;
    }

    public void setCrd(Date crd) {
        this.crd = crd;
    }
}
