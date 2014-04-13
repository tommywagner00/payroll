package com.payroll.transaction;

import com.payroll.payment.HourlyClassification;
import com.payroll.payment.PaymentClassification;
import com.payroll.payment.PaymentMethod;
import com.payroll.payment.PaymentSchedule;
import com.payroll.payment.WeeklySchedule;

/**
 * Created with IntelliJ IDEA.
 * User: ddcthomasw
 * Date: 3/12/14
 * Time: 5:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class AddHourlyEmployee extends AddEmployeeTransaction {

	private double hourlyRate;

	public AddHourlyEmployee(int empId, String name, String address, double hourlyRate) {
		super(empId, name, address);

		this.hourlyRate = hourlyRate;
	}

	@Override
	public PaymentClassification getPaymentClassification() {
		return new HourlyClassification(hourlyRate);
	}

	@Override
	public PaymentMethod getPaymentMethod() {
		return null;
	}

	@Override
	public PaymentSchedule getPaymentSchedule() {
		return new WeeklySchedule();
	}
}
