package boot.jpa.join.service;

import boot.jpa.join.domain.post.PostRepository;
import boot.jpa.join.dto.board.BoardPostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    @Transactional
    @ReadOnlyProperty
    public List<BoardPostDto> fetchBoardPostInnerJoin() {
        return postRepository.fetchBoardPostInnerJoin();
    }
    @Transactional
    @ReadOnlyProperty
    public List<BoardPostDto> fetchBoardPostCrossJoin() {
        return postRepository.fetchBoardPostCrossJoin();
    }
}
