package boot.jpa.join.domain.post;

import boot.jpa.join.dto.board.BoardPostDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("SELECT new boot.jpa.join.dto.board.BoardPostDto(b.boardName, p.title, p.content) "
            + "FROM Board b "
            + "INNER JOIN b.posts p")
    List<BoardPostDto> fetchBoardPostInnerJoin();
    @Query("SELECT new boot.jpa.join.dto.board.BoardPostDto(b.boardName, p.title, p.content) "
            + "FROM Board b, Post p")
    List<BoardPostDto> fetchBoardPostCrossJoin();

}
