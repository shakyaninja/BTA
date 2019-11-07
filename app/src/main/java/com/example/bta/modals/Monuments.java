package com.example.bta.modals;

public class Monuments {
    public String name;
    public String DOE;
    public String Description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOE() {
        return DOE;
    }

    public void setDOE(String DOE) {
        this.DOE = DOE;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Monuments(String name, String DOE, String description) {
        this.name = name;
        this.DOE = DOE;
        this.Description = description;
    }
}
