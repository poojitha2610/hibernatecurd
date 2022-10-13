package com.testhiber.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.getsession.GetSession;
import com.testModel.Employee;


public class EmployeeProvider implements Employeedao {

	public void addEmpployee(Employee employee) {
		SessionFactory factory=GetSession.getSessionFactory();
		Session ses=GetSession.getSession();
		try(factory;ses){
			ses.beginTransaction();
			ses.save(employee);
			ses.getTransaction().commit();
			System.out.println("employee data inserted");
		}
	}

	public Employee displayEmployee(Employee employee) 
	{
		SessionFactory  factory=GetSession.getSessionFactory();
		Session ses=GetSession.getSession();
		Employee e=null;
		try(factory;ses){
			ses.beginTransaction();
			e=ses.get(Employee.class,employee.getId());
			//System.out.println(employee.getE_id() +" "+employee.getE_name()+"  "+employee.getE_sal());
			ses.getTransaction().commit();
			return e;
		}

	}

	public void deleteEmployee(Employee employee) {
		SessionFactory factory=GetSession.getSessionFactory();
		Session ses=GetSession.getSession();
		Employee e=null;
		try(factory;ses)
		{
			ses.beginTransaction();
			e=ses.get(Employee.class,employee.getId());	
			ses.delete(e);
			ses.getTransaction().commit();
		}

	}

	@Override
	public void updateEmployee(Employee employee) {
		SessionFactory factory=GetSession.getSessionFactory();
		Session ses=GetSession.getSession();
		Employee e=null;
		try(factory;ses)
		{
			ses.beginTransaction();
			e=ses.get(Employee.class,employee.getSal());	
			ses.update(e);
			ses.getTransaction().commit();
		}// TODO Auto-generated method stub
		
	}

}
