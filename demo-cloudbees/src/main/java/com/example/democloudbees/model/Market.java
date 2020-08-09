package com.example.democloudbees.model;

public class Market {
    private int id;
    private String name;
    private String coords;
    private String address;
    private String imgUrl;

    public Market(int id, String name, String coords, String address, String imgUrl){
        this.id = id;
        this.name = name;
        this.coords = coords;
        this.address = address;
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
