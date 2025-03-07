package up.ac.za.artifactup.service;

import up.ac.za.artifactup.dto.ArtifactDTO;

import java.util.List;

public interface ArtifactService {

  List<ArtifactDTO> findAll();
}
