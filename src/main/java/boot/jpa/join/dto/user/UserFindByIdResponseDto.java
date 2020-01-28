package boot.jpa.join.dto.user;

import boot.jpa.join.domain.user.User;
import boot.jpa.join.dto.comment.CommentFindAllResponseDto;
import boot.jpa.join.dto.post.PostFindAllResponseDto;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class UserFindByIdResponseDto {

    private Long id;
    private String name;
    private String email;
    private List<PostFindAllResponseDto> posts;
    private List<CommentFindAllResponseDto> comments;

    public UserFindByIdResponseDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.posts = user.getPosts().stream()
                .map(PostFindAllResponseDto::new)
                .collect(Collectors.toList());
        this.comments = user.getComments().stream()
                .map(CommentFindAllResponseDto::new)
                .collect(Collectors.toList());
    }
}
