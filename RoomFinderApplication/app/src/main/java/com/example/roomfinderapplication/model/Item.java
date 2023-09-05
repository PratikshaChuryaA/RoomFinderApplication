package com.example.roomfinderapplication.model;

import java.util.List;

public class Item {
    private String location;
    private String price;

    private String description;
    private String shortDescription;
    private String image;



    public Item() {
    }

    public Item(String location, String price, String shortDescription) {
        this.location = location;
        this.price = price;
        this.shortDescription = shortDescription;
    }


    public Item(String location, String price, String description, String shortDescription, String image) {
        this.location = location;
        this.price = price;
        this.description = description;
        this.shortDescription = shortDescription;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }


}
