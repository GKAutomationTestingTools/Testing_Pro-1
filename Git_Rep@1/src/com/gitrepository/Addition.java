package com.gitrepository;

public class Addition {

	public int a=10;
	public int b=10;
	
	public static void main(String[] args) {
		 Addition a = new Addition();
		 Substraction sub = new Substraction();
		 Multplication mul = new Multplication();
		 a.Addition1();
		 	sub.sub();
		 	mul.Mul();
		 	System.out.println(" testing 01 emp ");
		
	}
	public void Addition1() {
		
		System.out.println( "Sum ="+(a+b));
		
		
		
	}

}
