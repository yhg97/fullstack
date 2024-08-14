package org.scoula.join.service;

import org.scoula.board.domain.BoardVO;
import org.scoula.board.dto.BoardDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class JoinServiceImpl {
    @Override
    public BoardDTO create(BoardDTO board) {
        log.info("create......" + board);
        BoardVO boardVO= board.toVo();
        mapper.create(boardVO);


        List<MultipartFile> files = board.getFiles();
        if (files != null && !files.isEmpty()) {
            upload(boardVO.getNo(), files);
        }
        return get(boardVO.getNo());
    }
}
