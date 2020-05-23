package com.spring.DAO;
import java.util.List;

import com.spring.bean.Customer;

public interface IMyDAO {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(int customerid);
	public Customer getCustomer(int customerid);
	public List<Customer> getAllCustomer();

}
