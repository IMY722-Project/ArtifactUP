package za.ac.up.artifactup.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "artefacts")
@Data
@NoArgsConstructor
public class Artefact {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 500)
  private String title;

  @Column(nullable = false)
  private String artist;

  @Column(columnDefinition = "TEXT")
  private String description;

  @ManyToOne
  @JoinColumn(name = "cat_id", nullable = false)
  private Category category;

  @Column(nullable = false)
  private String location;

  @Column(nullable = false)
  private LocalDate date;

  @Column(nullable = false, updatable = false)
  private LocalDateTime created;

  @PrePersist
  protected void onCreate() {
    this.created = LocalDateTime.now();
  }
}