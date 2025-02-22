package com.banking.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
public class AccountsDto {

    @NotEmpty(message = "Account Number can't be a null or empty")
    @Pattern(regexp = "($|[0-9]{10})", message = "Account Number should be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "Account Type can't be a null or empty")
    private String accountType;

    @NotEmpty(message = "Branch Address can't be a null or empty")
    private String branchAddress;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }
}
