package za.ac.up.artifactup.dto;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import za.ac.up.artifactup.domain.Artifact;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ArtifactMapper {

  ArtifactDTO toDTO(Artifact artifact);

  List<ArtifactDTO> toDTOs(List<Artifact> artifacts);

  Artifact toEntity(ArtifactDTO artifactDTO);

}
