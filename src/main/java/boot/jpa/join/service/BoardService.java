package boot.jpa.join.service;

import boot.jpa.join.domain.board.BoardRepository;
import boot.jpa.join.dto.board.BoardPostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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
}
