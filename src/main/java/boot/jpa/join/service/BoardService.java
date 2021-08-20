package boot.jpa.join.service;

import boot.jpa.join.domain.board.Board;
import boot.jpa.join.domain.board.BoardRepository;
import boot.jpa.join.dto.board.BoardPostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    @ReadOnlyProperty
    public List<BoardPostDto> fetchBoardPostLeftJoin() {
        return boardRepository.fetchBoardPostLeftJoin();
    }
    
    @Transactional
    @ReadOnlyProperty
    public List<BoardPostDto> fetchBoardPostRightJoin() {
        return boardRepository.fetchBoardPostRightJoin();
    }

    @Transactional
    @ReadOnlyProperty
    public List<String> findAllPostTitles() {
        return boardRepository.findAll().stream()
                .map(a -> a.getPosts().get(0).getTitle())
                .collect(Collectors.toList());
    }

    @Transactional
    @ReadOnlyProperty
    public List<String> findAllJoinFetch() {
        return boardRepository.findAllJoinFetch().stream()
                .map(a -> a.getPosts().get(0).getTitle())
                .collect(Collectors.toList());
    }
}
