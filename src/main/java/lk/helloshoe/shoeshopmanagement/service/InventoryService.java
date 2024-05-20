package lk.helloshoe.shoeshopmanagement.service;


import lk.helloshoe.shoeshopmanagement.dto.InventoryDTO;

import java.util.List;

public interface InventoryService {
    List<InventoryDTO> getAllInventory();
    InventoryDTO getInventoryDetails(String id);
    void saveInventory(InventoryDTO inventoryDTO);
    void updateInventory(InventoryDTO inventoryDTO);
    void deleteInventory(String id);
}
