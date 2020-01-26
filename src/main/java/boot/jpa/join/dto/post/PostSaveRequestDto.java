package boot.jpa.join.dto.post;

import boot.jpa.join.domain.board.Board;
import boot.jpa.join.domain.post.Post;
import boot.jpa.join.domain.user.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PostSaveRequestDto {

    private String title;
    private String content;
    private Board board;
    private User user;

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .content(content)
                .board(board)
                .user(user)
                .build();
    }
}
