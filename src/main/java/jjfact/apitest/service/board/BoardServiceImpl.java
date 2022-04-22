package jjfact.apitest.service.board;

import jjfact.apitest.domain.board.Board;
import jjfact.apitest.domain.user.User;
import jjfact.apitest.repository.board.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public Board getBoard(Long id) {
        Board board = boardRepository.findById(id).orElseThrow(() -> {
            return new NoSuchElementException("조회 실패");
        });
        return board;
    }

    @Override
    public List<Board> getBoardList() {
        List<Board> boardList = boardRepository.findAll();
        return boardList;
    }

    @Transactional
    @Override
    public void insert(Board board, User user) {
        boardRepository.save(board);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        boardRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void update(Long id) {

    }
}
