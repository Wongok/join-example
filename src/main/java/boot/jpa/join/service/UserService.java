package boot.jpa.join.service;

import boot.jpa.join.domain.user.UserRepository;
import boot.jpa.join.dto.post.PostFindAllResponseDto;
import boot.jpa.join.dto.user.UserFindAllResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    @ReadOnlyProperty
    public List<PostFindAllResponseDto> UserPostInnerJoin() {
        return userRepository.UserPostInnerJoin();
    }

    @Transactional
    @ReadOnlyProperty
    public List<UserFindAllResponseDto> UserPostFetchJoin() {
        return userRepository.UserPostFetchJoin();
    }
}
