package za.ac.up.artifactup.service;

import za.ac.up.artifactup.dto.ArtifactDTO;

import java.util.List;

public interface ArtifactService {

  List<ArtifactDTO> findAll();
}
