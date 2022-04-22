package jjfact.apitest.repository.category;

import jjfact.apitest.domain.categorry.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
