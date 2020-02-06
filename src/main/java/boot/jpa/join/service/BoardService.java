package boot.jpa.join.service;

import boot.jpa.join.domain.board.BoardRepository;
import boot.jpa.join.dto.board.BoardPostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public List<BoardPostDto> fetchBoardPostLeftJoin() {
        return boardRepository.fetchBoardPostLeftJoin();
    }

    public List<BoardPostDto> fetchBoardPostRightJoin() {
        return boardRepository.fetchBoardPostRightJoin();
    }
}
