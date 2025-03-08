package za.ac.up.artifactup.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import za.ac.up.artifactup.dto.ArtifactDTO;
import za.ac.up.artifactup.dto.ArtifactMapper;
import za.ac.up.artifactup.repository.ArtifactRepository;
import za.ac.up.artifactup.service.ArtifactService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtifactServiceImpl implements ArtifactService {

  private final ArtifactRepository artifactRepository;

  private final ArtifactMapper artifactMapper;

  @Override
  public List<ArtifactDTO> findAll() {
    return artifactMapper.toDTOs(artifactRepository.findAll());
  }
}
