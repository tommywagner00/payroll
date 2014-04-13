package com.payroll.transaction;

import com.payroll.payment.BiWeeklySchedule;
import com.payroll.payment.CommissionedClassification;
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
public class AddCommisionedEmployee extends AddEmployeeTransaction {

	private double commissionedRate;
	private double salary;

	public AddCommisionedEmployee(int empId, String name, String address, double commissionedRate, double salary) {
		super(empId, name, address);

		this.commissionedRate = commissionedRate;
		this.salary = salary;
	}

	@Override
	public PaymentClassification getPaymentClassification() {
		return new CommissionedClassification(commissionedRate, salary);
	}

	@Override
	public PaymentMethod getPaymentMethod() {
		return null;
	}

	@Override
	public PaymentSchedule getPaymentSchedule() {
		return new BiWeeklySchedule();
	}
}
