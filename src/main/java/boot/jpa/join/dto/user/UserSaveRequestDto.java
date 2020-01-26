package boot.jpa.join.dto.user;

import boot.jpa.join.domain.user.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserSaveRequestDto {

    private String name;
    private String email;

    public User toEntity() {
        return User.builder()
                .name(name)
                .email(email)
                .build();
    }
}
