package com.example.democloudbees.controller;

import com.example.democloudbees.model.Market;
import com.example.democloudbees.model.builder.MarketBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/market")
public class MarketController {

    @GetMapping
    public HttpEntity<List<Market>> getAll() {
        List<Market> allMarkets = demoMarkets();
        return new ResponseEntity<>(allMarkets, HttpStatus.OK);
    }

    private ArrayList<Market> demoMarkets(){
        ArrayList<Market> markets = new ArrayList<>();

        markets.add(new MarketBuilder().
                withId(1).
                withAddress("St 123").
                withCoords("32.3232, 23.23232").
                withImgUrl("img1.jpg").
                withName("El mercadito").
                build());

        markets.add(new MarketBuilder().
                withId(2).
                withAddress("Mitre 203").
                withCoords("32.3232, 34.23232").
                withImgUrl("img1.jpg").
                withName("El chino de la vuelta").
                build());

        markets.add(new MarketBuilder().
                withId(8).
                withAddress("Alvear 23").
                withCoords("34.3232, 33.23232").
                withImgUrl("img1.jpg").
                withName("Lo pibito").
                build());

        markets.add(new MarketBuilder().
                withId(123).
                withAddress("Alem 23").
                withCoords("33.3232, 34.23232").
                withImgUrl("img1.jpg").
                withName("El chino de la esquina").
                build());

        return markets;
    }

}
