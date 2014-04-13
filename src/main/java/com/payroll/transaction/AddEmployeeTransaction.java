package com.payroll.transaction;

import com.payroll.Employee;
import com.payroll.payment.PaymentClassification;
import com.payroll.payment.PaymentMethod;
import com.payroll.payment.PaymentSchedule;
import com.payroll.PayrollDB;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;

import java.beans.beancontext.BeanContext;

/**
 * Created with IntelliJ IDEA.
 * User: ddcthomasw
 * Date: 3/12/14
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
@Qualifier("addEmployee")
public abstract class AddEmployeeTransaction {

	@Autowired
	private PayrollDB payrollDB;

	private int empId;
	private String name;
	private String address;

	public AddEmployeeTransaction(int empId, String name, String address){
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public void execute(){
		PaymentClassification pc = getPaymentClassification();
		PaymentSchedule ps = getPaymentSchedule();
		PaymentMethod pm = getPaymentMethod();

		Employee employee = new Employee(empId, name, address);
		employee.setPaymentClassification(pc);
		employee.setPaymentSchedule(ps);
		employee.setPaymentMethod(pm);

		payrollDB.addEmployee(empId, employee);
	}

	public abstract PaymentClassification getPaymentClassification();
	public abstract PaymentMethod getPaymentMethod();
	public abstract PaymentSchedule getPaymentSchedule();

	private PayrollDB getPayrollDB(){
		ApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();
		return (PayrollDB) ctx.getBean("payrollDB");
	}

	public void setPayrollDB(PayrollDB payrollDB){
		this.payrollDB = payrollDB;
	}

}
