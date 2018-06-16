package com.example.sne.olcademy ;
public class Elecdemo {
    private int id;
    private int image;
    private String name;
    private String cost;

    public Elecdemo(int id, int image, String name, String cost) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
