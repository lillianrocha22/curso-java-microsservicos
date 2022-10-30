package com.lillianrocha.msscbrewery.service;

import com.lillianrocha.msscbrewery.web.dto.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
