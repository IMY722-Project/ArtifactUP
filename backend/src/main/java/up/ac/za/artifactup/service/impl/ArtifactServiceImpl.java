package up.ac.za.artifactup.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import up.ac.za.artifactup.dto.ArtifactDTO;
import up.ac.za.artifactup.dto.ArtifactMapper;
import up.ac.za.artifactup.repository.ArtifactRepository;
import up.ac.za.artifactup.service.ArtifactService;

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
