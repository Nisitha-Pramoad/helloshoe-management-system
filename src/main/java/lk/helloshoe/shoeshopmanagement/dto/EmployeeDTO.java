package lk.helloshoe.shoeshopmanagement.dto;

import lk.helloshoe.shoeshopmanagement.util.Gender;
import lk.helloshoe.shoeshopmanagement.util.Role;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDTO {
    private String employeeCode;
    private String employeeName;
    private Gender gender;
    private String status;
    private String designation;
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
    private String employeePicture;
}
