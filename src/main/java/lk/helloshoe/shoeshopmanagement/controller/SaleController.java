package lk.helloshoe.shoeshopmanagement.controller;


import lk.helloshoe.shoeshopmanagement.dto.SaleDTO;
import lk.helloshoe.shoeshopmanagement.service.SaleService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sales")
@CrossOrigin
public class SaleController {

    private SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveSale(SaleDTO saleDTO){

    }
}
