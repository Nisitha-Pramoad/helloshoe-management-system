package lk.helloshoe.shoeshopmanagement.repository;


import lk.helloshoe.shoeshopmanagement.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier,String> {
}
