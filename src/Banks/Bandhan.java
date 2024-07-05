package Banks;

public class Bandhan implements SimpleInterestCalculator{
	
	private  static final double INTEREST_RATE = 1.05;// 12.05 % annual Interest Rate

	@Override
	public double calulator(double amount, int months) {
		// TODO Auto-generated method stub
		return (amount * INTEREST_RATE * months)/100;
	}
	

}
