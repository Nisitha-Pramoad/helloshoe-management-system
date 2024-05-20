package lk.helloshoe.shoeshopmanagement.controller;


import lk.helloshoe.shoeshopmanagement.dto.SupplierDTO;
import lk.helloshoe.shoeshopmanagement.service.SupplierService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
@CrossOrigin
public class SupplierController {
    private SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    private List<SupplierDTO> getAllSupplier(){
        return supplierService.getAllSupplier();
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public SupplierDTO getSupplierDetails(@PathVariable("id") String id){
        return supplierService.getSupplierDetails(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSupplier(@RequestBody SupplierDTO supplierDTO){
        supplierService.saveSupplier(supplierDTO);
    }

    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void updateSupplier(@RequestBody SupplierDTO supplierDTO){
        supplierService.updateSupplier(supplierDTO);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void deleteSupplier(@PathVariable String id){
        supplierService.deleteSupplier(id);
    }

}
