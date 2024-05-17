package lk.helloshoe.shoeshopmanagement.dao;

import lk.helloshoe.shoeshopmanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Long> {
}
