package za.ac.up.artifactup.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "file_storage")
@Data
@NoArgsConstructor

public class FileStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "artefact_id", nullable = false)
    private Artefact artefact;

    @Column(nullable = false, length = 255)
    private String fileType;

    @Column(nullable = false, length = 500)
    private String s3Url;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
