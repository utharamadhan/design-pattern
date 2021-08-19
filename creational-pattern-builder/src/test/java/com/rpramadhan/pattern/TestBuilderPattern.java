package com.rpramadhan.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestBuilderPattern {

  @Test
  public void testJuniorBankAccount() {
    BankAccount juniorBankAccount =
        JuniorBankAccountBuilder.newInstance()
            .accountNumber("12345678")
            .customerName("Udin Jr.")
            .customerAge(15)
            .customerGender("MALE")
            .customerBeneficiary(AdultBankAccountBuilder.newInstance().build())
            .build();

    Assert.assertEquals(juniorBankAccount.getAccountNumber(), "12345678");
    Assert.assertEquals(juniorBankAccount.getCustomerName(), "Udin Jr.");
    Assert.assertEquals(juniorBankAccount.getCustomerAge().intValue(), 15);
    Assert.assertEquals(juniorBankAccount.getCustomerGender(), "MALE");
    Assert.assertNotNull(juniorBankAccount.getCustomerBeneficiary());
    Assert.assertNull(juniorBankAccount.getCustomerIdCard());
  }

  @Test
  public void testAdultBankAccount() {
    BankAccount adultBankAccount =
        AdultBankAccountBuilder.newInstance()
            .accountNumber("12345679")
            .customerName("Udin Sr.")
            .customerAge(31)
            .customerGender("MALE")
            .customerIdCard("87654321")
            .build();

    Assert.assertEquals(adultBankAccount.getAccountNumber(), "12345679");
    Assert.assertEquals(adultBankAccount.getCustomerName(), "Udin Sr.");
    Assert.assertEquals(adultBankAccount.getCustomerAge().intValue(), 31);
    Assert.assertEquals(adultBankAccount.getCustomerGender(), "MALE");
    Assert.assertEquals(adultBankAccount.getCustomerIdCard(), "87654321");
    Assert.assertNull(adultBankAccount.getCustomerBeneficiary());
  }
}
