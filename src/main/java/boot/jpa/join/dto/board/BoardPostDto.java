package boot.jpa.join.dto.board;

import lombok.Getter;

@Getter
public class BoardPostDto {

    private String boardName;
    private String postTitle;
    private String postContent;

    public BoardPostDto(String boardName, String postTitle, String postContent) {
        this.boardName = boardName;
        this.postTitle = postTitle;
        this.postContent = postContent;
    }
}
