package lk.ijse.gdse.springboot.back_end.service;

import lk.ijse.gdse.springboot.back_end.dto.SaleDetailsDTO;

import java.util.List;

public interface SaleDetailsService {
    List<SaleDetailsDTO> getAllSaleDetails();
    SaleDetailsDTO getSaleDetails(String id);
    void saveSaleDetails(SaleDetailsDTO saleDetailsDTO);
    void deleteSaleDetails(String id);
    SaleDetailsDTO getTopSale();
}
