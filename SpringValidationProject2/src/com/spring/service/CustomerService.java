package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.DAO.IMyDAO;
import com.spring.DAO.MyDAO;
import com.spring.bean.Customer;
@Service
@Transactional
public class CustomerService implements ICustomerService {
	
	@Autowired
	IMyDAO dao;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.addCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer);
	}

	@Override
	public Customer deleteCustomer(int customerid) {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(customerid);
	}

	@Override
	public Customer getCustomer(int customerid) {
		// TODO Auto-generated method stub
		return dao.getCustomer(customerid);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

}
