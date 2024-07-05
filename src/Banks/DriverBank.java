package Banks;

import java.util.*;

public class DriverBank {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*****Welcome To BANK API**********......");
		System.out.println("    Your Loan is few clicks Away ........");
		System.out.println("Please Note..:-  Input Format : BANK_NAME : AMOUNT: MONTHS ");
		String input = scanner.nextLine();
		
		String[] inputData = input.split(" ");
		
		
        String bankName = inputData[0];
        double amount = Double.parseDouble(inputData[1]);
        int month = Integer.parseInt(inputData[2]);
        
        SimpleInterestCalculator calculator = null;
        
        switch (bankName.toLowerCase()) {
        case "bandhan":
        	calculator = new Bandhan();
        	
        break;
        
        case "hdfc":
        	calculator = new Hdfc();
        	
        break;
        
        case "icici":
        	calculator = new Icici();
        	
        break;
        
        case "sbi":
        	calculator = new Sbi();
        	
        break;
        
        default: 
        	System.out.println("INVALID BANK NAME");
        	System.exit(1);
   
        }
        
        double interest = calculator.calulator(amount, month);
        
        System.out.println("Your Annual Interest Of Your Amount is : " +interest);
        
		scanner.close();
		

	}

}
