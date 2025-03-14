package za.ac.up.artifactup.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "artefact_parts")
@Data
@NoArgsConstructor

public class ArtefactPart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "artefact_id", nullable = false)
    private Artefact artefact;

    @Column(nullable = false)
    private String name;

    private String descr;

    private Float xCoords;
    private Float yCoords;
    private Float zCoords;

    @Column(length = 500)
    private String s3Url;

}
