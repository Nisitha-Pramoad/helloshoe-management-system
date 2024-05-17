package lk.helloshoe.shoeshopmanagement.controller;

import lk.helloshoe.shoeshopmanagement.model.Customer;
import lk.helloshoe.shoeshopmanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/allCustomers")
    public List<Customer> getALlCustomers() {
        System.out.println("all customers wada!");
        return customerService.getAllCustomers();
    }
}
