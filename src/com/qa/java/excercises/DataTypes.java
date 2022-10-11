package com.qa.java.excercises;

public class DataTypes {

	public static void main(String[] args) {
		float salary;
		salary = 35000;
		
		float incrementedSalary;
		incrementedSalary = (float) (salary * 10.5 /100);
		
		salary += incrementedSalary;
		
		System.out.println("updated Salary : " + salary);
		
		float applePricePerKg = 3.25f;
		float appleDiscountPrice = (applePricePerKg * 10/100);
		float applePricePerKgAfterDiscount;
		applePricePerKgAfterDiscount = applePricePerKg - appleDiscountPrice;
		System.out.println(applePricePerKgAfterDiscount);

	}

}
