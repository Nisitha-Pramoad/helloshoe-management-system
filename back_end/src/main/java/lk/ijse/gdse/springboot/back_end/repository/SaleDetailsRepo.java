package lk.ijse.gdse.springboot.back_end.repository;

import lk.ijse.gdse.springboot.back_end.entity.SaleDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleDetailsRepo extends JpaRepository<SaleDetails,String> {

    @Query(value = "SELECT * FROM sale_details WHERE order_no = :orderId", nativeQuery = true)
    List<SaleDetails> findOrderDetailsByOrderId(String orderId);
}
