package domain;

import lombok.Data;

import java.util.List;

@Data
public class UserInfo {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String phoneNum;
    private int status;
    private String statusStr;
    private List<Role> roles;

    public String getStatusStr() {
        //状态0 未开启 1 开启
        if (status == 0) {
            statusStr = "未开启";
        } else if (status == 1) {
            statusStr = "开启";
        }
        return statusStr;
    }
}
