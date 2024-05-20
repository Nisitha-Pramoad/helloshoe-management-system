package lk.helloshoe.shoeshopmanagement.service.impl;

import lk.helloshoe.shoeshopmanagement.dto.CustomerDTO;
import lk.helloshoe.shoeshopmanagement.model.Customer;
import lk.helloshoe.shoeshopmanagement.repository.CustomerRepo;
import lk.helloshoe.shoeshopmanagement.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private ModelMapper modelMapper;
    private CustomerRepo customerRepo;

    public CustomerServiceImpl(ModelMapper modelMapper, CustomerRepo customerRepo) {
        this.modelMapper = modelMapper;
        this.customerRepo = customerRepo;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepo.findAll().stream().map(customer -> modelMapper.map(customer,CustomerDTO.class)).toList();
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {
        if (!customerRepo.existsById(id)) {
            throw new RuntimeException("Customer Id: " + id + " does not exist");
        }
        return modelMapper.map(customerRepo.findById(id).get(),CustomerDTO.class);
    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        if (!customerRepo.existsById(customerDTO.getCustomerCode())) {
            throw new RuntimeException("Customer Id: " + customerDTO.getCustomerCode() + " does not exist");
        }
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepo.deleteById(id);
    }
}
