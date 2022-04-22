package jjfact.apitest.dto.board;

import jjfact.apitest.domain.board.Board;
import jjfact.apitest.domain.user.User;
import lombok.Getter;


@Getter
public class BoardInsertReq {
    private String title;
    private String content;

    public Board toEntity(){
        return Board.builder()
                .title(title)
                .content(content)
                .build();
    }

}
