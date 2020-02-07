package boot.jpa.join.service;

import boot.jpa.join.domain.user.UserRepository;
import boot.jpa.join.dto.post.PostFindAllResponseDto;
import boot.jpa.join.dto.user.UserFindAllResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    List<PostFindAllResponseDto> UserPostInnerJoin() {
        return userRepository.UserPostInnerJoin();
    }

    public List<UserFindAllResponseDto> UserPostFetchJoin() {
        return userRepository.UserPostFetchJoin();
    }
}
