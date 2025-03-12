package za.ac.up.artifactup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.up.artifactup.entity.FileStorage;


@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {

    @Query("SELECT f FROM FileStorage f where f.artefact.id = :artefactId")
    FileStorage findByArtefactId(@Param("artefactId") Long artefactId);
}

