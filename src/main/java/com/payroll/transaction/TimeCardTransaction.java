package com.payroll.transaction;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ddcthomasw
 * Date: 3/12/14
 * Time: 6:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeCardTransaction {

	private int empId;
	private Date date;
	private double hours;

	public TimeCardTransaction(int empId, Date date, double hours){
		this.empId = empId;
		this.date = date;
		this.hours = hours;
	}
}
