package com.testhiber.HibernateCrud;

import com.testModel.Employee;

public interface Employeedao
{
public  void addEmpployee(Employee employee);
public Employee displayEmployee(Employee employee);
public void deleteEmployee(Employee employee);
public void updateEmployee(Employee employee);
}
