package za.ac.up.artifactup.service;

import za.ac.up.artifactup.dto.ArtefactDTO;

import java.util.List;

public interface ArtefactService<T> {

  List<T> findAll();

  T saveArtifact(T artifact);

  List<T> findAllArtifactsByCategoryId(Long categoryId);
}
