package domain;

import lombok.Data;

@Data
public class Member {
    private Integer id;
    private String name;
    private String nickname;
    private String phoneNum;
    private String email;
}
