package jjfact.apitest.service.category;

import jjfact.apitest.domain.categorry.Category;
import jjfact.apitest.domain.user.User;

import java.util.List;

public interface CategoryService {
    Category getCategory(Long id);
    List<Category> getCategoryList();
    void insertCategory(Category category);
    void delete(Long id);
    void update(Long id);
}
