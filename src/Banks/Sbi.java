package Banks;

public class Sbi implements SimpleInterestCalculator{
	private static final double INTEREST_RATE = 0.80; //9.6 % annual rate

	
	@Override
	public double calulator(double amount, int months) {
		// TODO Auto-generated method stub
		return (amount * INTEREST_RATE * months)/100;
	}

}
