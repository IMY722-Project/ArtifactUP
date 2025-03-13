package za.ac.up.artifactup.dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import za.ac.up.artifactup.entity.Artefact;
import za.ac.up.artifactup.entity.Category;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ArtefactMapper {

  @Mapping(target = "category", expression = "java(artefact.getCategory().getName())")
  ArtefactDTO toDTO(Artefact artefact);

  List<ArtefactDTO> toDTOs(List<Artefact> artefacts);

  Artefact toEntity(ArtefactDTO artefactDTO);

  default String map(Category value) {
      return value.getName();
  }

  default Category map(String value) {
    return new Category().builder().name(value).build();
  }

}
