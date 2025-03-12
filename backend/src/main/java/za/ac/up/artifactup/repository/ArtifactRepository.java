package za.ac.up.artifactup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.up.artifactup.domain.Artifact;
import za.ac.up.artifactup.entity.Artefact;

import java.util.List;

@Repository
public interface ArtifactRepository extends JpaRepository<Artefact,Long> {

  @Query("SELECT a FROM Artefact a WHERE a.category.id = :categoryId")
  List<Artefact> findByCategoryId(@Param("categoryId") Long categoryId);
}
