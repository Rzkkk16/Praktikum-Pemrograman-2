package com.example.module7.dao;

import com.example.module7.model.Customer;
import javafx.collections.ObservableList;

public interface CustomerDao {


    void addCustomer(Customer customer);
    ObservableList<Customer> findAllCustomers();
    void updateCustomer(Customer customer);
    void deleteCustomer(int customerId);
}
