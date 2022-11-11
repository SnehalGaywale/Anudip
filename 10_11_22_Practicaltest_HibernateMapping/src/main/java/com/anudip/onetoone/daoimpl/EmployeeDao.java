package com.anudip.onetoone.daoimpl;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.onetoone.congfi.HbUtil;
import com.anudip.onetoone.dao.Employee1Dao;
import com.anudip.onetoone.entity.AddressProof;
import com.anudip.onetoone.entity.Employee;

public class EmployeeDao implements Employee1Dao {
	
	public void add() {
		try {
			Session session=HbUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			AddressProof ad=new AddressProof();
			ad.setAddress("kothrud pune");
			ad.setType("Adhar");
			ad.setState("Maharashtra");
			ad.setCity("pune");

			Employee emp=new Employee();
			emp.setName("Snehal");
			emp.setPhone("5675876897");
			emp.setEmail("snehalgaywale@gmail.com");
			emp.setAp(ad);
			session.save(emp);
			
			t.commit();
			System.out.println("Added Successfully");

		}catch(HibernateException e) {
			e.printStackTrace();
		}


	}
	
	public void fetchEmployee(int id) {
		try {

			Session session=HbUtil.getSessionFactory().openSession();
			Employee em=session.get(Employee.class, id);
			System.out.println("========Customer Deatails are============");
			System.out.println(em.toString());

		}catch (HibernateException e) {
			e.printStackTrace();
		}


	}
}
