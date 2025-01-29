package fr.efrei.springrag.repository;

import fr.efrei.springrag.domain.Document;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

}
