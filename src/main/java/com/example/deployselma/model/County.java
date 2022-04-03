package com.example.deployselma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class County {

    @Id
    @Column(name="countycode")
    private String countyCode;
    private String name;
    private String href;


    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "County{" +
                "countyCode='" + countyCode + '\'' +
                ", name='" + name + '\'' +
                ", href='" + href + '\'' +
                '}';
    }

}