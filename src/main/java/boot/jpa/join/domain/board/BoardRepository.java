package boot.jpa.join.domain.board;

import boot.jpa.join.dto.board.BoardPostDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    @Query("SELECT new boot.jpa.join.dto.board.BoardPostDto(b.boardName, p.title, p.content) "
            + "FROM Board b "
            + "LEFT JOIN b.posts p")
    List<BoardPostDto> fetchBoardPostLeftJoin();

    @Query("SELECT new boot.jpa.join.dto.board.BoardPostDto(b.boardName, p.title, p.content) "
            + "FROM Board b "
            + "LEFT JOIN b.posts p")
    List<BoardPostDto> fetchBoardPostRightJoin();


    @Query("SELECT b " +
            "FROM Board b " +
            "JOIN FETCH b.posts")
    List<Board> findAllJoinFetch();
}
