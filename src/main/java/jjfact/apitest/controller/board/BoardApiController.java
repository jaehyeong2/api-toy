package jjfact.apitest.controller.board;

import jjfact.apitest.domain.board.Board;
import jjfact.apitest.domain.user.User;
import jjfact.apitest.dto.board.BoardInsertReq;
import jjfact.apitest.dto.ApiResponse;
import jjfact.apitest.service.board.BoardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/board")
@RestController
public class BoardApiController {

    private final BoardServiceImpl boardService;

    @GetMapping("/{id}")
    public ApiResponse<?> getBoard(@PathVariable Long id){
        Board board = boardService.getBoard(id);
        return new ApiResponse<>(board, HttpStatus.OK);
    }

    @GetMapping("")
    public ApiResponse<?> getUserList(){
        List<Board> boardList = boardService.getBoardList();
        return new ApiResponse<>(boardList, HttpStatus.OK);
    }

    @PostMapping("")
    public ApiResponse<?> insert(@RequestBody BoardInsertReq req, @AuthenticationPrincipal User user){
        Board board = req.toEntity();
        boardService.insert(board,user);
        return new ApiResponse<>("ok", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<?> delete(@PathVariable Long id){
        boardService.delete(id);
        return new ApiResponse<>("ok", HttpStatus.OK);
    }
}
