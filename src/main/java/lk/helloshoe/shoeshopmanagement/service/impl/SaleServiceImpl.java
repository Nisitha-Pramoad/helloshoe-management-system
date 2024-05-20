package lk.helloshoe.shoeshopmanagement.service.impl;


import lk.helloshoe.shoeshopmanagement.dto.SaleDTO;
import lk.helloshoe.shoeshopmanagement.model.Sale;
import lk.helloshoe.shoeshopmanagement.repository.SaleRepo;
import lk.helloshoe.shoeshopmanagement.service.SaleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService {

    private ModelMapper modelMapper;
    private SaleRepo saleRepo;

    public SaleServiceImpl(ModelMapper modelMapper, SaleRepo saleRepo) {
        this.modelMapper = modelMapper;
        this.saleRepo = saleRepo;
    }

    @Override
    public void saveSale(SaleDTO saleDTO) {
        saleRepo.save(modelMapper.map(saleDTO, Sale.class));
    }
}
