package jjfact.apitest.domain.content.repository;

import jjfact.apitest.domain.content.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content,Long> {
}
