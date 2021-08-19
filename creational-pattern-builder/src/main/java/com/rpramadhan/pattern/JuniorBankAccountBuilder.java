package com.rpramadhan.pattern;

public class JuniorBankAccountBuilder implements BankAccountBuilder {

  protected String accountNumber;
  protected String customerName;
  protected String customerGender;
  protected Integer customerAge;
  protected String customerIdCard;
  protected BankAccount customerBeneficiary;

  public static JuniorBankAccountBuilder newInstance() {
    return new JuniorBankAccountBuilder();
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
    throw new IllegalArgumentException("junior cannot have id card yet");
  }

  @Override
  public BankAccountBuilder customerBeneficiary(BankAccount customerBeneficiary) {
    this.customerBeneficiary = customerBeneficiary;
    return this;
  }

  @Override
  public BankAccount build() {
    return new BankAccount(this);
  }
}
