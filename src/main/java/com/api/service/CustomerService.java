package com.api.service;

import com.api.domain.Customer;
import com.api.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Transactional(readOnly = true)
    public List<Customer> findByLastName(String lastName){
        return customerRepository.findByLastName(lastName);
    }
}