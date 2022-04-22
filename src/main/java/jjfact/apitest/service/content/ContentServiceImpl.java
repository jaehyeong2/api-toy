package jjfact.apitest.service.content;

import jjfact.apitest.domain.content.Content;
import jjfact.apitest.repository.content.ContentRepository;
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
public class ContentServiceImpl implements ContentService {

    private final ContentRepository contentRepository;

    @Override
    public Content getContent(Long id) {
        Content content = contentRepository.findById(id).orElseThrow(() -> {
            return new NoSuchElementException("조회 실패");
        });
        return content;
    }

    @Override
    public List<Content> getContentList() {
        List<Content> contentList = contentRepository.findAll();
        return contentList;
    }

    @Transactional
    @Override
    public void insert(Content content) {
        contentRepository.save(content);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        contentRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void update(Long id) {

    }
}
