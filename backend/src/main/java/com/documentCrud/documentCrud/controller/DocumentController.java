package com.documentCrud.documentCrud.controller;

import com.documentCrud.documentCrud.dto.DocumentDTO;
import com.documentCrud.documentCrud.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/documents")
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @GetMapping
    public List<DocumentDTO> findAllDocuments() {
        return documentService.findAll();
    }
}
