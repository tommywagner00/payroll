package com.springapp.mvc;

import com.payroll.PayrollDB;
import com.payroll.transaction.AddCommisionedEmployee;
import com.payroll.transaction.AddEmployeeTransaction;
import com.payroll.transaction.AddHourlyEmployee;
import com.payroll.transaction.AddSalariedEmployee;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/transaction")
public class TransactionController{

	private Map<String, AddEmployeeTransaction> transactions = new HashMap<String, AddEmployeeTransaction>();

	@Autowired
	private PayrollDB payrollDB;

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap map){
		return "transaction";
	}

	@RequestMapping(value="/addEmployee", method = RequestMethod.POST)
	public String addEmployee(ModelMap model,
							  @RequestParam(value="type", required=false)  String type,
						 @RequestParam(value="empId", required=false)  String id,
						 @RequestParam(value="name", required=false)  String name,
						 @RequestParam(value="address", required=false)  String address,
						 @RequestParam(value="rate", required=false)  String rate )
	{
		AddEmployeeTransaction transaction = new employeeTransactionBuilder(type)
				.withId(id)
				.withName(name)
				.build();

		transaction.setPayrollDB(payrollDB);
		transaction.execute();

		model.put("message", "Success!");

		return "basic";
	}

	@RequestMapping(value="/hourly", method = RequestMethod.POST)
	public String hourly(ModelMap model,
						  @RequestParam(value="empId", required=false)  String id,
						  @RequestParam(value="name", required=false)  String name,
						  @RequestParam(value="address", required=false)  String address,
						  @RequestParam(value="rate", required=false)  String rate )
	{
		AddEmployeeTransaction transaction =
				new AddHourlyEmployee(Integer.parseInt(id), name, address, Double.parseDouble(rate));
		transaction.setPayrollDB(payrollDB);
		transaction.execute();

		model.put("message", "Success!");

		return "basic";
	}

	@RequestMapping(value="/salaried", method = RequestMethod.POST)
	public String salaried(ModelMap model,
						  @RequestParam(value="empId", required=false)  String id,
						  @RequestParam(value="name", required=false)  String name,
						  @RequestParam(value="address", required=false)  String address,
						  @RequestParam(value="salary", required=false)  String salary )
	{
		AddEmployeeTransaction transaction =
				new AddSalariedEmployee(Integer.parseInt(id), name, address, Double.parseDouble(salary));
		transaction.setPayrollDB(payrollDB);
		transaction.execute();

		model.put("message", "Success!");

		return "basic";
	}

	@RequestMapping(value="/commissioned", method = RequestMethod.POST)
	public String commissioned(ModelMap model,
						  @RequestParam(value="empId", required=false)  String id,
						  @RequestParam(value="name", required=false)  String name,
						  @RequestParam(value="address", required=false)  String address,
						  @RequestParam(value="commission", required=false)  String commission,
						  @RequestParam(value="salary", required=false)  String salary)

	{
		AddEmployeeTransaction transaction =
				new AddCommisionedEmployee(Integer.parseInt(id), name, address, Double.parseDouble(commission), Double.parseDouble(salary));
		transaction.setPayrollDB(payrollDB);
		transaction.execute();

		model.put("message", "Success!");

		return "basic";
	}
}