package com.documentCrud.documentCrud.repository;

import com.documentCrud.documentCrud.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
