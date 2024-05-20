package lk.helloshoe.shoeshopmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "adminPanel")
public class AdminPanel {

    @Id
    private double totalSales;
    private double totalProfit;
    private String mostSaleItem;
    private String pictureOfTheMostSaleItem;
    private int mostSaleItemQty;


}
