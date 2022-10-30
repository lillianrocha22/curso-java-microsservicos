package com.lillianrocha.msscbrewery.service.impl;

import com.lillianrocha.msscbrewery.service.BeerService;
import com.lillianrocha.msscbrewery.web.dto.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
