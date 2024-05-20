package lk.helloshoe.shoeshopmanagement.service.impl;

import lk.helloshoe.shoeshopmanagement.dto.EmployeeDTO;
import lk.helloshoe.shoeshopmanagement.model.Employee;
import lk.helloshoe.shoeshopmanagement.repository.EmployeeRepo;
import lk.helloshoe.shoeshopmanagement.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private ModelMapper modelMapper;
    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(ModelMapper modelMapper, EmployeeRepo employeeRepo) {
        this.modelMapper = modelMapper;
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {
        return employeeRepo.findAll().stream().map(employee -> modelMapper.map(employee, EmployeeDTO.class)).toList();
    }

    @Override
    public EmployeeDTO getEmployeeDetails(String id) {
        return modelMapper.map(employeeRepo.findById(id).get(),EmployeeDTO.class);
    }

    @Override
    public void saveEmployee(EmployeeDTO employeeDTO) {
        employeeRepo.save(modelMapper.map(employeeDTO, Employee.class));
    }

    @Override
    public void updateEmployee(EmployeeDTO employeeDTO) {
        employeeRepo.save(modelMapper.map(employeeDTO, Employee.class));
    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepo.deleteById(id);
    }
}
