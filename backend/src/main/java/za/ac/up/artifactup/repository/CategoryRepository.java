package za.ac.up.artifactup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.up.artifactup.entity.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
