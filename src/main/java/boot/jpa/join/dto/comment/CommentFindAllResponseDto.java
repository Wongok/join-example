package boot.jpa.join.dto.comment;

import boot.jpa.join.domain.comment.Comment;
import boot.jpa.join.domain.post.Post;
import boot.jpa.join.domain.user.User;
import lombok.Getter;

@Getter
public class CommentFindAllResponseDto {

    private Long id;
    private String comment;
    private Post post;
    private User user;

    public CommentFindAllResponseDto(Comment comment) {
        this.id = comment.getId();
        this.comment = comment.getComment();
        this.post = comment.getPost();
        this.user = comment.getUser();
    }
}
