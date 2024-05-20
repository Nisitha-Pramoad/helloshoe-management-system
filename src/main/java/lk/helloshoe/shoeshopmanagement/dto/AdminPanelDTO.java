package lk.helloshoe.shoeshopmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminPanelDTO {
    private double totalSales;
    private double totalProfit;
    private String mostSaleItem;
    private String pictureOfTheMostSaleItem;
    private int mostSaleItemQty;
}
