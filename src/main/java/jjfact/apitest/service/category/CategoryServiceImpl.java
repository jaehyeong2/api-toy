package jjfact.apitest.service.category;

import jjfact.apitest.domain.categorry.Category;
import jjfact.apitest.repository.category.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category getCategory(Long id) {
        return null;
    }

    @Override
    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }

    @Transactional
    @Override
    public void insertCategory(Category category) {
        categoryRepository.save(category);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void update(Long id) {

    }
}
