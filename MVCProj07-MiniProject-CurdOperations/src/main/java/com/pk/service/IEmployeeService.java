//IEmployeeService
package com.pk.service;

import java.util.List;

import com.pk.model.Employee;

public interface IEmployeeService {
		public List<Employee> showAllEmployees();
		public String registerEmployee(Employee emp);
		public Employee fetchEmpByNo(int no);
		public String  modifyEmployeeByNo(Employee emp);
		public String removeEmployeeByNo(int no);
}
