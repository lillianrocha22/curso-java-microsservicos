package com.lillianrocha.msscbrewery.service.impl;

import com.lillianrocha.msscbrewery.service.CustomerService;
import com.lillianrocha.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .customerName("First Customer")
                .build();
    }
}
