package org.abstraction;

public class Bankdetails extends Partialabst {

	@Override
	public void bank() {
		// TODO Auto-generated method stub
		
		System.out.println("Bank name is HDFC");
	}

	@Override
	public void branch() {
		// TODO Auto-generated method stub
		
		System.out.println("Branch is OMR");
	}
	
	
public static void main(String[] args) {
	
	Bankdetails b=new Bankdetails();
	b.bank();
	b.branch();
	b.savings();
	b.salary();
	
}
}
