package com.lillianrocha.msscbrewery.service;

import com.lillianrocha.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
