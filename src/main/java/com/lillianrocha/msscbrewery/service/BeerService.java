package com.lillianrocha.msscbrewery.service;

import com.lillianrocha.msscbrewery.web.dto.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}
