package org.abstraction;

public class Sbi implements Rbibank {

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("savings is 10%");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
	
		System.out.println("Loan is 12%");
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("fixed is 15%");
	}
	
	public static void main(String[] args) {
		
		Sbi s=new Sbi();
		s.savings();
		s.loan();
		s.fixed();
		
	}

}
