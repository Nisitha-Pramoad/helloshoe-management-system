package lk.helloshoe.shoeshopmanagement.repository;


import lk.helloshoe.shoeshopmanagement.dto.SaleDTO;
import lk.helloshoe.shoeshopmanagement.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepo extends JpaRepository<Sale, SaleDTO> {
}
