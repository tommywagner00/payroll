package com.payroll.transaction;

import com.payroll.payment.MonthlySchedule;
import com.payroll.payment.PaymentClassification;
import com.payroll.payment.PaymentMethod;
import com.payroll.payment.PaymentSchedule;
import com.payroll.payment.SalariedClassification;

public class AddSalariedEmployee extends AddEmployeeTransaction {

	private double salary;

	public AddSalariedEmployee(int empId, String name, String address, double salary) {
		super(empId, name, address);

		this.salary = salary;
	}

	@Override
	public PaymentClassification getPaymentClassification() {
		return new SalariedClassification(salary);
	}

	@Override
	public PaymentMethod getPaymentMethod() {
		return null;
	}

	@Override
	public PaymentSchedule getPaymentSchedule() {
		return new MonthlySchedule();
	}
}
