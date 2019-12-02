package com.example.bta.modals;

public class Guides {
    private String name;
    private  int image;
    private String Location;
    private String Description;
    private String PhoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Guides(String name, int image, String location, String description, String phoneNumber) {
        this.name = name;
        this.image = image;
        Location = location;
        Description = description;
        PhoneNumber = phoneNumber;
    }
}
