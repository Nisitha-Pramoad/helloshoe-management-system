package lk.helloshoe.shoeshopmanagement.repository;

import lk.helloshoe.shoeshopmanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, String> {
}
