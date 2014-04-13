package com.payroll;

import com.payroll.payment.PaymentClassification;
import com.payroll.payment.PaymentMethod;
import com.payroll.payment.PaymentSchedule;

/**
 * Created with IntelliJ IDEA.
 * User: ddcthomasw
 * Date: 3/12/14
 * Time: 5:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
	public static final Integer ZERO = 0;

	private int empId;
	private String name;
	private String address;

	private PaymentSchedule paymentSchedule;
	private PaymentMethod paymentMethod;
	private PaymentClassification paymentClassification;

	public Employee(Integer empId, String name, String address){
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public PaymentClassification getPaymentClassification() {
		return paymentClassification;
	}

	public void setPaymentClassification(PaymentClassification paymentClassification) {
		this.paymentClassification = paymentClassification;
	}

	public PaymentSchedule getPaymentSchedule() {
		return paymentSchedule;
	}

	public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
