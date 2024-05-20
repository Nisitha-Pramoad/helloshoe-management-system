package lk.helloshoe.shoeshopmanagement.repository;

import lk.helloshoe.shoeshopmanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, String> {
}
