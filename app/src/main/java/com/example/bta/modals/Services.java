package com.example.bta.modals;

public class Services {
    protected String name;
    protected String description;
    protected int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Services(String name, String description, int image) {
        this.name = name;
        this.description=description;
        this.image = image;

    }
}
