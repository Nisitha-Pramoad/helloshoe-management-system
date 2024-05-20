package lk.helloshoe.shoeshopmanagement.dto;


import lk.helloshoe.shoeshopmanagement.util.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String email;
    private String password;
    private Role role;
}
