package lk.helloshoe.shoeshopmanagement.dto;

import lk.helloshoe.shoeshopmanagement.util.Gender;
import lk.helloshoe.shoeshopmanagement.util.Level;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {
    private String customerCode;
    private String customerName;
    private Gender gender;
    private Date joinDate;
    private Level level;
    private int totalPoint;
    private Date dob;
    private String addressLine01;
    private String addressLine02;
    private String addressLine03;
    private String addressLine04;
    private String addressLine05;
    private String contactNo;
    private String email;
    private Timestamp recentPurchaseDate;
}
