package com.spring.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.spring.bean.Customer;
@Repository//Use for Object Creation........

public class MyDAO implements IMyDAO {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Customer addCustomer(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		entityManager.merge(customer);
		return customer;
	}

	@Override
	public Customer deleteCustomer(int customerid) {
		Customer customer=entityManager.find(Customer.class,customerid );
		entityManager.remove(customer);
		return customer;
	}

	@Override
	public Customer getCustomer(int customerid) {
		Customer customer=entityManager.find(Customer.class,customerid );
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		TypedQuery<Customer> tq=entityManager.createQuery("select cust from Customer cust",Customer.class);
		List<Customer> list=tq.getResultList();
		return list;
	}
	
	
}
