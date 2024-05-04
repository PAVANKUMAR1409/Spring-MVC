package com.pk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.dao.IEmployeeDAO;
import com.pk.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService 
{
		@Autowired
		private IEmployeeDAO dao;
		@Override
		public List<Employee> showAllEmployees() {
			List<Employee> list=dao.getAllEmployees();
			return list;
		}
		@Override
		public String registerEmployee(Employee emp) {
			int count=dao.insertEmployee(emp);
			return count==0?"Employee Not Registered":"Employee Registered";
		}
		
		@Override
		public Employee fetchEmpByNo(int no) {
			Employee emp=dao.getEmployeeByNo(no);
			return emp;
		}
		
		@Override
		public String modifyEmployeeByNo(Employee emp) {
			int k=dao.updateEmployee(emp);
			return k==0?"Employee Not Found for Update":"Employee Found and Updated";
		}
		
		@Override
		public String removeEmployeeByNo(int no) {
			int k=dao.deleteEmployeeByNo(no);
			return k==0?"Employee Not Fount":"Employee Found and Deleted";
		}

}// class
