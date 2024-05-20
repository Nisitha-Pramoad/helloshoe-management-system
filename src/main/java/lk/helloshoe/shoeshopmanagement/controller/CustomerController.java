package lk.helloshoe.shoeshopmanagement.controller;

import lk.helloshoe.shoeshopmanagement.dto.CustomerDTO;
import lk.helloshoe.shoeshopmanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin()
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/allCustomers")
    public List<CustomerDTO> getALlCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping(value = "/{id}")
    public CustomerDTO getCustomerDetails(@PathVariable("id") String id){
        return customerService.getCustomerDetails(id);
    }
}
