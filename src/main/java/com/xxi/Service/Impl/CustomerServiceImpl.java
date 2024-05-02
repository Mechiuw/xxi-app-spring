package com.xxi.Service.Impl;

import com.xxi.Models.Entity.Customer;
import com.xxi.Models.Request.CustomerRequest;
import com.xxi.Models.Response.CustomerResponse;
import com.xxi.Repository.CustomerRepository;
import com.xxi.Service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public CustomerResponse create(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .name(customerRequest.getName())
                .birthDate(customerRequest.getBirthDate())
                .phoneNumber(customerRequest.getPhoneNumber())
                .email(customerRequest.getEmail())
                .address(customerRequest.getAddress())
                .build();
        customerRepository.save(customer);
        return CustomerResponse.builder()
                .name(customer.getName())
                .email(customer.getEmail())
                .build();
    }
}
