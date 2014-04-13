package com.springapp.mvc;

import com.payroll.PayrollDB;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class PayrollDBController {

	private static final String EMPLOYEES = "EMPLOYEES";

	@Autowired
	private PayrollDB payrollDB;

	@RequestMapping(method = RequestMethod.GET)
	public String receive(ModelMap model, @RequestParam(value="id", required=false)  String id) {

		if(StringUtils.isNotBlank(id)){
			model.put(EMPLOYEES, Arrays.asList(payrollDB.getEmployee(Integer.parseInt(id))));
		}else{
			model.put(EMPLOYEES, payrollDB.getAll());
		}
		return "employeeDb";
	}
}