package za.ac.up.artifactup.entity;

import jakarta.persistence.*;
import lombok.*;

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
    private String name;

    @Column(columnDefinition = "TEXT")
    private String descr;

    @Column(nullable = false, updatable = false)
    private LocalDateTime created;

    @ManyToOne
    @JoinColumn(name = "cat_id", nullable = false)
    private Category category;

    @PrePersist
    protected void onCreate() {
        this.created = LocalDateTime.now();
    }
}