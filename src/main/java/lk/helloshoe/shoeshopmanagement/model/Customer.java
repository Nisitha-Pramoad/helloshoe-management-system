package lk.helloshoe.shoeshopmanagement.model;

import jakarta.persistence.*;
import lk.helloshoe.shoeshopmanagement.util.Gender;
import lk.helloshoe.shoeshopmanagement.util.Level;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    private
    String customerCode;
    private String customerName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date JoinDate;
    @Enumerated(EnumType.STRING)
    private Level level;
    private int TotalPoint;
    private Date dob;
    private String addressLine01;
    private String addressLine02;
    private String addressLine03;
    private String addressLine04;
    private String addressLine05;
    private String contactNo;
    private String email;
    private Timestamp RecentPurchaseDate;

}
