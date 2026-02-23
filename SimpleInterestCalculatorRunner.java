package practice;
import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","7.5"); // passing value as string for BigDecimal
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);
	}

}
