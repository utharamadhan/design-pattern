package com.rpramadhan.pattern;

public class AdultBankAccountBuilder implements BankAccountBuilder {

  protected String accountNumber;
  protected String customerName;
  protected String customerGender;
  protected Integer customerAge;
  protected String customerIdCard;

  public static AdultBankAccountBuilder newInstance() {
    return new AdultBankAccountBuilder();
  }

  @Override
  public BankAccountBuilder accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  @Override
  public BankAccountBuilder customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  @Override
  public BankAccountBuilder customerGender(String customerGender) {
    this.customerGender = customerGender;
    return this;
  }

  @Override
  public BankAccountBuilder customerAge(Integer customerAge) {
    this.customerAge = customerAge;
    return this;
  }

  @Override
  public BankAccountBuilder customerIdCard(String customerIdCard) {
    this.customerIdCard = customerIdCard;
    return this;
  }

  @Override
  public BankAccountBuilder customerBeneficiary(BankAccount customerBeneficiary) {
    throw new IllegalArgumentException("adult account cannot have beneficiary");
  }

  @Override
  public BankAccount build() {
    return new BankAccount(this);
  }
}
