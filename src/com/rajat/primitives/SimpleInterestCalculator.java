package com.rajat.primitives;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {

		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {

		// totalvalue = principal + principal * interest * number of years

		return principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));

	}

}
