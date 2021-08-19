package com.rpramadhan.pattern;

public interface BankAccountBuilder {

  public BankAccountBuilder accountNumber(String accountNumber);

  public BankAccountBuilder customerName(String customerName);

  public BankAccountBuilder customerGender(String customerGender);

  public BankAccountBuilder customerAge(Integer customerAge);

  public BankAccountBuilder customerIdCard(String customerIdCard);

  public BankAccountBuilder customerBeneficiary(BankAccount customerBeneficiary);

  public BankAccount build();

}
