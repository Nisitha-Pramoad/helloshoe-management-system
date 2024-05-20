package lk.helloshoe.shoeshopmanagement.service.impl;


import lk.helloshoe.shoeshopmanagement.dto.InventoryDTO;
import lk.helloshoe.shoeshopmanagement.model.Inventory;
import lk.helloshoe.shoeshopmanagement.repository.InventoryRepo;
import lk.helloshoe.shoeshopmanagement.service.InventoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    private ModelMapper modelMapper;
    private InventoryRepo inventoryRepo;

    public InventoryServiceImpl(ModelMapper modelMapper, InventoryRepo inventoryRepo) {
        this.modelMapper = modelMapper;
        this.inventoryRepo = inventoryRepo;
    }

    @Override
    public List<InventoryDTO> getAllInventory() {
        return inventoryRepo.findAll().stream().map(inventory -> modelMapper.map(inventory, InventoryDTO.class)).toList();
    }

    @Override
    public InventoryDTO getInventoryDetails(String id) {
        return modelMapper.map(inventoryRepo.findById(id).get(), InventoryDTO.class);
    }

    @Override
    public void saveInventory(InventoryDTO inventoryDTO) {
        inventoryRepo.save(modelMapper.map(inventoryDTO, Inventory.class));
    }

    @Override
    public void updateInventory(InventoryDTO inventoryDTO) {
        inventoryRepo.save(modelMapper.map(inventoryDTO, Inventory.class));
    }

    @Override
    public void deleteInventory(String id) {
        inventoryRepo.deleteById(id);
    }
}
