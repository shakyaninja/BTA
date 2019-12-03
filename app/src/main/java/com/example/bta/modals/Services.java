package com.example.bta.modals;

public class Services {
    protected String name;
    protected String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Services(String name, String image) {
        this.name = name;
        this.image = image;
    }
}
