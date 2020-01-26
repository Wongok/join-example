package boot.jpa.join.dto.comment;

import boot.jpa.join.domain.comment.Comment;
import boot.jpa.join.domain.post.Post;
import boot.jpa.join.domain.user.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CommentSaveRequestDto {

    private String comment;
    private Post post;
    private User user;

    public Comment toEntity() {
        return Comment.builder()
                .comment(comment)
                .post(post)
                .user(user)
                .build();
    }
}
