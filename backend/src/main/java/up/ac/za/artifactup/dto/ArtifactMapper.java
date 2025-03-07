package up.ac.za.artifactup.dto;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import up.ac.za.artifactup.domain.Artifact;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ArtifactMapper {

  ArtifactDTO toDTO(Artifact artifact);

  List<ArtifactDTO> toDTOs(List<Artifact> entities);

  Artifact toEntity(ArtifactDTO employeeDTO);

}
