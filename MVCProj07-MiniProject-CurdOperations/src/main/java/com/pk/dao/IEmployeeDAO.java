//IEmployeeDAO.java
package com.pk.dao;

import java.util.List;

import com.pk.model.Employee;

public interface IEmployeeDAO 
{
		public List<Employee> getAllEmployees();
		public int insertEmployee(Employee emp);
		public Employee getEmployeeByNo(int no);
		public int updateEmployee(Employee emp);
		public int deleteEmployeeByNo(int no);
}
