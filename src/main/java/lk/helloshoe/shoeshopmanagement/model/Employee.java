package lk.helloshoe.shoeshopmanagement.model;

import jakarta.persistence.*;
import lk.helloshoe.shoeshopmanagement.util.Gender;
import lk.helloshoe.shoeshopmanagement.util.Role;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private String employeeCode;
    private String employeeName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String status;
    private String designation;
    @Enumerated(EnumType.STRING)
    private Role accessRole;
    private Date dob;
    private  Date dateOfJoin;
    private String attachedBranch;
    private String addressLine01;
    private String addressLine02;
    private String addressLine03;
    private String addressLine04;
    private String addressLine05;
    private String contactNo;
    private String email;
    private String informInCaseOfEmergency;
    private String emergencyContact;
    @Column(columnDefinition = "LONGTEXT")
    private String employeePicture;
}
