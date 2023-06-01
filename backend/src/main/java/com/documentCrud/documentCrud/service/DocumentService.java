package com.documentCrud.documentCrud.service;

import com.documentCrud.documentCrud.dto.DocumentDTO;
import com.documentCrud.documentCrud.entities.Document;
import com.documentCrud.documentCrud.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    public List<DocumentDTO> findAll() {
        List<Document> documents = documentRepository.findAll();
        return documents.stream().map(doc -> new DocumentDTO(doc)).collect(Collectors.toList());
    }
}
