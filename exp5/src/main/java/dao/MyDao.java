package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;


import dto.Customer;


public class MyDao {
	
	

	
		//hybernate
		
				EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
				EntityManager manager=factory.createEntityManager();
				EntityTransaction transaction =manager.getTransaction();
				private Object Customer;
				
				public void save(Customer customer) {
				   transaction.begin();
					manager.persist(customer);
	               transaction.commit();
			
//				Customer fetchByEmail(String email)
//				{
////				 javax.persistence.Query query = manager.createQuery("select x from Customer x where email=?1").setParameter(1, email);
//					//x is variable it can be anything   (JPQL)=> java persistence querry language
//					// jpql is just like sql =>in sql for select table we write select*from emp; here in place of star* we use x.
//					// where email=? is just for accuping space for email
//				     List<Customer>list = manager.createQuery("select x from Customer x where email=?1").setParameter(1, email).getResultList();
//				     // get Resultset is used to execute the query
//				     if(list.isEmpty())
//				    	 return null;
//				     else
//				    	 return list.get(0);
//				}
				
//				public Customer fetchByMobile(long mobile)
//				{
//				    List<Customer>list = manager.createQuery("select x from Customer x where mobile=?1").setParameter(1, mobile).getResultList();
//				     // get Resultset is used to execute the query
//				     if(list.isEmpty())
//				    	 return null;
//				     else
//				    	 return list.get(0);
//				}
				
				
	           
				}

				public dto.Customer fetchByEmail(String email) {
					// TODO Auto-generated method stub
					return null;
				}

				public Object fetchByMobile(long mobile) {
					// TODO Auto-generated method stub
					return null;
				}


}
