package com.payroll.payment;

/**
 * Created with IntelliJ IDEA.
 * User: ddcthomasw
 * Date: 3/12/14
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class HourlyClassification implements PaymentClassification {

	private double hourlyRate;
	private TimeCard timeCard;

	public HourlyClassification(double hourlyRate){
		this.hourlyRate = hourlyRate;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setSalary(double rate) {
		this.hourlyRate = rate;
	}
}
