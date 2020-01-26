package boot.jpa.join.domain.post;

import boot.jpa.join.domain.board.Board;
import boot.jpa.join.domain.comment.Comment;
import boot.jpa.join.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_POST_BOARD"))
    private Board board;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_POST_USER"))
    private User user;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Comment> comments = new ArrayList<>();

    @Builder
    public Post(String title, String content, Board board, User user) {
        this.title = title;
        this.content = content;
        this.board = board;
        this.user = user;
    }
}
