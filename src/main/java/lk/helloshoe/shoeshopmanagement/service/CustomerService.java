package lk.helloshoe.shoeshopmanagement.service;

import lk.helloshoe.shoeshopmanagement.dao.CustomerDao;
import lk.helloshoe.shoeshopmanagement.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;


    public List<Customer> getAllCustomers() {
        return customerDao.findAll();
    }
}
