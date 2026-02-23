package practice;

import java.math.BigDecimal;

//Total Amount = principal + principal * Interest * noOfYears;


public class SimpleInterestCalculator {
	
	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		// TODO Auto-generated constructor stub
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// TODO Auto-generated method stub
		BigDecimal totalValue = principal.add(principal.multiply(interest)).multiply(new BigDecimal(noOfYears));
		return totalValue;
	}

}
