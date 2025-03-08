package za.ac.up.artifactup.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.up.artifactup.dto.ArtifactDTO;
import za.ac.up.artifactup.service.ArtifactService;

import java.util.List;

@RestController
@RequestMapping("/api/artifact")
@RequiredArgsConstructor
public class ArtifactController {

  private final ArtifactService artifactService;

  @GetMapping
  public ResponseEntity<List<ArtifactDTO>> findAllArtifacts() {
    return ResponseEntity.ok(artifactService.findAll());
  }
}
