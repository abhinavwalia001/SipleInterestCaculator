package Banks;

public class Hdfc implements SimpleInterestCalculator {
	private  static final double INTEREST_RATE = 1.0;  //12 % annual rate

	@Override
	public double calulator(double amount, int months) {
		// TODO Auto-generated method stub
		return (amount * INTEREST_RATE * months)/100;
	}

}
