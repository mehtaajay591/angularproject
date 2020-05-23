package com.spring.service;

import java.util.List;

import com.spring.bean.Customer;

public interface ICustomerService {

	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(int customerid);
	public Customer getCustomer(int customerid);
	public List<Customer> getAllCustomer();
}
