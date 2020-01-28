package boot.jpa.join.dto.board;

import boot.jpa.join.domain.board.Board;
import boot.jpa.join.dto.post.PostFindAllResponseDto;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class BoardFindAllResponseDto {

    private Long id;
    private String boardName;
    private List<PostFindAllResponseDto> posts;

    public BoardFindAllResponseDto(Board board) {
        this.id = board.getId();
        this.boardName = board.getBoardName();
        this.posts = board.getPosts().stream()
                .map(PostFindAllResponseDto::new)
                .collect(Collectors.toList());
    }
}
