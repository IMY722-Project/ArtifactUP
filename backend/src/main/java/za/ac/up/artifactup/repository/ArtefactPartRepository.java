package za.ac.up.artifactup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.up.artifactup.entity.ArtefactPart;


@Repository
public interface ArtefactPartRepository extends JpaRepository<ArtefactPart, Long> {

}
