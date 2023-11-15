package com.onepieceapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tab_pirates")
public class Members {
    @Id
    private String name;
    private String description;
    private String hole;

    public Members( String name, String description, String hole) {
        this.name = name;
        this.description = description;
        this.hole = hole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHole() {
        return hole;
    }

    public void setHole(String hole) {
        this.hole = hole;
    }
}
