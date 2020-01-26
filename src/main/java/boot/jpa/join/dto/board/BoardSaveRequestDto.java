package boot.jpa.join.dto.board;

import boot.jpa.join.domain.board.Board;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class BoardSaveRequestDto {

    private String boardName;

    public Board toEntity() {
        return Board.builder()
                .boardName(boardName)
                .build();
    }
}
