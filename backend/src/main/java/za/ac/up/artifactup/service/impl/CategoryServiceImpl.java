package za.ac.up.artifactup.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import za.ac.up.artifactup.entity.Category;
import za.ac.up.artifactup.repository.CategoryRepository;
import za.ac.up.artifactup.service.CategoryService;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

  private final CategoryRepository categoryRepository;

  @Override
  public Category saveCategory(Category category) {
    return categoryRepository.save(category);
  }

  @Override
  public Optional<Category> findByName(String name) {
    return categoryRepository.findByName(name);
  }
}
