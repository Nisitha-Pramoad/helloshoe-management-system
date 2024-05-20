package lk.helloshoe.shoeshopmanagement.repository;


import lk.helloshoe.shoeshopmanagement.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory,String> {
}
