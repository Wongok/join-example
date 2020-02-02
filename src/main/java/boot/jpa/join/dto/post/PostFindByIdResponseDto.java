package boot.jpa.join.dto.post;

import boot.jpa.join.domain.board.Board;
import boot.jpa.join.domain.comment.Comment;
import boot.jpa.join.domain.post.Post;
import boot.jpa.join.domain.user.User;
import boot.jpa.join.dto.comment.CommentFindAllResponseDto;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class PostFindByIdResponseDto {

    private Long id;
    private String title;
    private String content;
    private Board board;
    private User user;
    private List<CommentFindAllResponseDto> comments;

    public PostFindByIdResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.board = post.getBoard();
        this.user = post.getUser();
        this.comments = post.getComments().stream()
                .map(CommentFindAllResponseDto::new)
                .collect(Collectors.toList());
    }
}
