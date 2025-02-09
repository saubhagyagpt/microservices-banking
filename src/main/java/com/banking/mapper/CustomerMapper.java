package com.banking.mapper;

import com.banking.dto.AccountsDto;
import com.banking.dto.CustomerDto;
import com.banking.entity.Accounts;
import com.banking.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapTOCustomerDto(Customer customer, CustomerDto customerDto){
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapTOCustomer(Customer customer, CustomerDto customerDto){
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
