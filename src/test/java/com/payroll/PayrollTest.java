package com.payroll;

import com.payroll.payment.PaymentClassification;
import com.payroll.payment.PaymentMethod;
import com.payroll.payment.PaymentSchedule;
import com.payroll.payment.SalariedClassification;
import com.payroll.transaction.AddSalariedEmployee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: ddcthomasw
 * Date: 3/12/14
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class PayrollTest {

	private PayrollDB payrollDB;

	@Test
	public void testAddSalariedEmployee(){
		int empId = 1;
		AddSalariedEmployee addSalariedEmployee = new AddSalariedEmployee(empId, "Bob", "Home", 1000);
		addSalariedEmployee.execute();

		Employee employee = payrollDB.getEmployee(empId);
		assertEquals("Bob", employee.getName());

		PaymentClassification paymentClassification = employee.getPaymentClassification();
		assertTrue(paymentClassification instanceof SalariedClassification);

		//assertEquals(1000, employee.getSalary());

		PaymentSchedule paymentSchedule = employee.getPaymentSchedule();
	//	assertTrue(paymentSchedule instanceof MonthlySchedule);

		PaymentMethod paymentMethod = employee.getPaymentMethod();
		//assertTrue(paymentMethod instanceof HoldMethod);
	}
}
