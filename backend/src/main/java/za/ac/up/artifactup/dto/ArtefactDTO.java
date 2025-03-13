package za.ac.up.artifactup.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import za.ac.up.artifactup.entity.Category;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArtefactDTO {

  private String title;

  private String description;

  private String category;

  private String artist;

  private String location;

  private LocalDate date;
}
