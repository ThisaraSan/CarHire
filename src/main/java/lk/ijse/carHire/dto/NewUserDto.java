package lk.ijse.carHire.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewUserDto {
    private String crUserName;
    private String crUserPassword;
    private String cnfrmUserPassword;

}
