package com.payroll.payment;

/**
 * Created with IntelliJ IDEA.
 * User: ddcthomasw
 * Date: 3/12/14
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommissionedClassification implements PaymentClassification {

	private double commisionedRate;
	private double salary;

	public CommissionedClassification(double commisionedRate, double salary){
		this.commisionedRate = commisionedRate;
		this.salary = salary;
	}

	public double getSalary() {
		return commisionedRate;
	}

	public void setSalary(double commisionedRate) {
		this.commisionedRate = commisionedRate;
	}

	public double getCommisionedRate() {
		return commisionedRate;
	}

	public void setCommisionedRate(double commisionedRate) {
		this.commisionedRate = commisionedRate;
	}
}
