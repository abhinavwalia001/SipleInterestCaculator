package Banks;

public class Icici implements SimpleInterestCalculator {
	private static final double INTEREST_RATE = 0.1; // 12 % annual rate

	
	@Override
	public double calulator(double amount, int months) {
		// TODO Auto-generated method stub
		return (amount * INTEREST_RATE * months)/100;
	}

}
