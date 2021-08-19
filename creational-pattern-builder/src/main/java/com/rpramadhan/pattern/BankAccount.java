package com.rpramadhan.pattern;

public class BankAccount {

  private String accountNumber;
  private String customerName;
  private String customerGender;
  private Integer customerAge;
  private String customerIdCard;
  private BankAccount customerBeneficiary;

  public BankAccount(AdultBankAccountBuilder adultBankAccountBuilder) {
    this.accountNumber = adultBankAccountBuilder.accountNumber;
    this.customerName = adultBankAccountBuilder.customerName;
    this.customerGender = adultBankAccountBuilder.customerGender;
    this.customerAge = adultBankAccountBuilder.customerAge;
    this.customerIdCard = adultBankAccountBuilder.customerIdCard;
  }

  public BankAccount(JuniorBankAccountBuilder juniorBankAccountBuilder) {
    this.accountNumber = juniorBankAccountBuilder.accountNumber;
    this.customerName = juniorBankAccountBuilder.customerName;
    this.customerGender = juniorBankAccountBuilder.customerGender;
    this.customerAge = juniorBankAccountBuilder.customerAge;
    this.customerIdCard = juniorBankAccountBuilder.customerIdCard;
    this.customerBeneficiary = juniorBankAccountBuilder.customerBeneficiary;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getCustomerGender() {
    return customerGender;
  }

  public Integer getCustomerAge() {
    return customerAge;
  }

  public String getCustomerIdCard() {
    return customerIdCard;
  }

  public BankAccount getCustomerBeneficiary() {
    return customerBeneficiary;
  }
}
