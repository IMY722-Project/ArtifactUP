package za.ac.up.artifactup.repository;

import org.springframework.stereotype.Repository;
import za.ac.up.artifactup.domain.Artifact;

import java.util.List;

@Repository
public class ArtifactRepository {

  private final List<Artifact> artifacts;

  public ArtifactRepository() {
    this.artifacts = List.of(
            Artifact.builder().name("Mapungubwe Gold Rhino").build(),
            Artifact.builder().name("Klasies River Mouth Fossils").build()
    );
  }

  public List<Artifact> findAll() {
    return artifacts;
  }
}
