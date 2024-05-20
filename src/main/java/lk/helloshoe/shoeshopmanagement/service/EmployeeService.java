package lk.helloshoe.shoeshopmanagement.service;

import lk.helloshoe.shoeshopmanagement.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> getAllEmployee();
    EmployeeDTO getEmployeeDetails(String id);
    void saveEmployee(EmployeeDTO employeeDTO);
    void updateEmployee(EmployeeDTO employeeDTO);
    void deleteEmployee(String id);
}
