package lk.helloshoe.shoeshopmanagement.model;

import java.sql.Timestamp;
import java.util.Date;

public class Customer {

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    public enum Level {
        GOLD,
        SILVER,
        BRONZE,
        NEW
    }

    private String id;
    private String name;
    private Gender gender;  // Use enum type
    private Date joinDateAsALoyaltyCustomer;
    private Level level;  // Use enum type
    private Integer totalPoints;
    private Date dob;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String addressLine5;
    private String contactNo;
    private String email;
    private Timestamp recentPurchaseDateAndTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getJoinDateAsALoyaltyCustomer() {
        return joinDateAsALoyaltyCustomer;
    }

    public void setJoinDateAsALoyaltyCustomer(Date joinDateAsALoyaltyCustomer) {
        this.joinDateAsALoyaltyCustomer = joinDateAsALoyaltyCustomer;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getAddressLine5() {
        return addressLine5;
    }

    public void setAddressLine5(String addressLine5) {
        this.addressLine5 = addressLine5;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getRecentPurchaseDateAndTime() {
        return recentPurchaseDateAndTime;
    }

    public void setRecentPurchaseDateAndTime(Timestamp recentPurchaseDateAndTime) {
        this.recentPurchaseDateAndTime = recentPurchaseDateAndTime;
    }
}
