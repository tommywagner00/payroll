package com.payroll.payment;

/**
 * Created with IntelliJ IDEA.
 * User: ddcthomasw
 * Date: 3/12/14
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalariedClassification implements PaymentClassification {

	private double salary;

	public SalariedClassification(double salary){
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
