package com.payroll.payment;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ddcthomasw
 * Date: 3/12/14
 * Time: 6:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeCard {

	private Date date;
	private double hours;

	public TimeCard(Date date, double hours){
		this.date = date;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
}
