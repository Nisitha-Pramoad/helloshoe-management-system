package lk.helloshoe.shoeshopmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDetailsDTO {
    private int no;
    private String orderNo;
    private String itemCode;
}
