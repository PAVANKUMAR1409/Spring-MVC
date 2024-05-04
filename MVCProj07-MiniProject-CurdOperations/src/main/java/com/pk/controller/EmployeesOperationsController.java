package com.pk.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pk.model.Employee;
import com.pk.service.IEmployeeService;

@Controller
public class EmployeesOperationsController 
{
		@Autowired
		private IEmployeeService service;
		
		@GetMapping("/")
		public String showHomePage() {
			return "home";
		}
		
		@GetMapping("/report")
		public String showReport(Map<String, Object> map) {
			//use service
			List<Employee> list =service.showAllEmployees();
			map.put("list", list);
			return "show_report";
		}
		
		@GetMapping("/add_employee")
		public String showAddEmployeeFormPage(@ModelAttribute("emp") Employee emp ) {
				
				return "register_employee_form";
		}
		
		@PostMapping("/add_employee")
		public String processAddEmployeeSubmitForm(@ModelAttribute("emp") Employee emp,Map<String, Object> map) {
			String msg=service.registerEmployee(emp);
			List<Employee> list =service.showAllEmployees();
			map.put("msg", msg);
			map.put("list", list);
			return "show_report";
		}
		
		@GetMapping("/edit_employee")
		public String editEmployeeByNo(@RequestParam("no") int no,
															@ModelAttribute("emp") Employee emp) {
			Employee emp1=service.fetchEmpByNo(no);
			BeanUtils.copyProperties(emp1, emp);
			return "edit_employee_formpage";
		}
		
		@PostMapping("/update_employee")
		public String processupdateEmployeeFormSubmission(@ModelAttribute("emp") Employee emp,Map<String,Object> map) 
		{
				String msg=service.modifyEmployeeByNo(emp);
				List<Employee> list =service.showAllEmployees();
				map.put("msg", msg);
				map.put("list", list);
				return "show_report";
		}
		
		@GetMapping("/delete_employee")
		public String processDeletingTheEmployee(@RequestParam("no") int no,Map<String, Object> map)
		{
				String msg=service.removeEmployeeByNo(no);
				List<Employee> list =service.showAllEmployees();
				map.put("list", list);
				map.put("msg", msg);
				return "show_report";
		}
		
}
