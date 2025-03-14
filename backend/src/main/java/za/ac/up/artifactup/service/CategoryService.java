package za.ac.up.artifactup.service;

import za.ac.up.artifactup.entity.Category;

import java.util.Optional;

public interface CategoryService {

  public Category saveCategory(Category category);

  public Optional<Category> findByName(String name);

}
