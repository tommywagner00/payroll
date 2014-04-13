package com.payroll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ddcthomasw
 * Date: 3/12/14
 * Time: 5:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class PayrollDB {

	private Map<Integer, Employee> employeeMap;

	public PayrollDB(Map<Integer, Employee> employeeMap){
		this.employeeMap = employeeMap;
	}

	public void addEmployee(int empId, Employee employee){
		employeeMap.put(empId, employee);
	}

	public Employee getEmployee(int empId){
		return employeeMap.get(empId);
	}

	public List<Employee> getAll(){
		return new ArrayList<Employee>(employeeMap.values());
	}
}
