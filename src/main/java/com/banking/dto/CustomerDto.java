package com.banking.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name can't be a null or empty")
    @Size(min = 5, max = 30, message = "Name should be more than length 5 and less than 30")
    private String name;

    @NotEmpty(message = "Email can't be a null or empty")
    @Email(message = "Email Should be Valid value")
    private String email;

    @NotEmpty(message = "Mobile Number can't be a null or empty")
    @Pattern(regexp = "($|[0-9]{10})", message = "Mobile Number should be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public AccountsDto getAccountsDto() {
        return accountsDto;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setAccountsDto(AccountsDto accountsDto) {
        this.accountsDto = accountsDto;
    }
}
