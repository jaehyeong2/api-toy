package jjfact.apitest.service.board;

import jjfact.apitest.domain.board.Board;
import jjfact.apitest.domain.user.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BoardService {
    Board getBoard(Long id);
    List<Board> getBoardList();

    @Transactional
    void insert(Board board, User user);

    void delete(Long id);
    void update(Long id);
}
