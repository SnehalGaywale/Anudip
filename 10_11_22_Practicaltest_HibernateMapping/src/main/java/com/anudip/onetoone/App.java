package com.anudip.onetoone;


	import com.anudip.onetoone.daoimpl.EmployeeDao;

	
	public class App 
	{
	    public static void main( String[] args )
	    {

	    	EmployeeDao em=new EmployeeDao();
	    	    	em.fetchEmployee(20);
	    }
}
