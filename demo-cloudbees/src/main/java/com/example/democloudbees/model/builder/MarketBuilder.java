package com.example.democloudbees.model.builder;

import com.example.democloudbees.model.Market;

public class MarketBuilder {
    private int id;
    private String name;
    private String coords;
    private String address;
    private String imgUrl;

    public Market build(){
        return new Market(id,name,coords,address,imgUrl);
    }

    public MarketBuilder withId(int id){
        this.id = id;
        return this;
    }

    public MarketBuilder withName(String name){
        this.name = name;
        return this;
    }
    public MarketBuilder withCoords(String coords){
        this.coords = coords;
        return this;
    }
    public MarketBuilder withAddress(String address){
        this.address = address;
        return this;
    }
    public MarketBuilder withImgUrl(String imgUrl){
        this.imgUrl = imgUrl;
        return this;
    }
}
