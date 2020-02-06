package boot.jpa.join.service;

import boot.jpa.join.domain.post.PostRepository;
import boot.jpa.join.dto.board.BoardPostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<BoardPostDto> fetchBoardPostInnerJoin() {
        return postRepository.fetchBoardPostInnerJoin();
    }

    public List<BoardPostDto> fetchBoardPostCrossJoin() {
        return postRepository.fetchBoardPostCrossJoin();
    }
}
