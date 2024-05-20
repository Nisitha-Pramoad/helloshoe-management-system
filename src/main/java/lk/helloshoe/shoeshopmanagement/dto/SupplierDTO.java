package lk.helloshoe.shoeshopmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SupplierDTO {
    private String supplierCode;
    private String supplierName;
    private String category;
    private String addressLine01;
    private String addressLine02;
    private String addressLine03;
    private String addressLine04;
    private String addressLine05;
    private String addressLine06;
    private String contactNo1;
    private String contactNo2;
    private String email;


}
