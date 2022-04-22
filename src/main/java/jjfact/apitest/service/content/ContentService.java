package jjfact.apitest.service.content;

import jjfact.apitest.domain.content.Content;

import java.util.List;

public interface ContentService {
    Content getContent(Long id);
    List<Content> getContentList();
    void insert(Content content);
    void delete(Long id);
    void update(Long id);
}
