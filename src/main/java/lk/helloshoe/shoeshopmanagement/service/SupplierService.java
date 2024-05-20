package lk.helloshoe.shoeshopmanagement.service;


import lk.helloshoe.shoeshopmanagement.dto.SupplierDTO;

import java.util.List;

public interface SupplierService {

    List<SupplierDTO> getAllSupplier();
    SupplierDTO getSupplierDetails(String id);
    void saveSupplier(SupplierDTO supplierDTO);
    void updateSupplier(SupplierDTO supplierDTO);
    void deleteSupplier(String id);
}
