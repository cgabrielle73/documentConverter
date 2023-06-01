package com.documentCrud.documentCrud.dto;

import com.documentCrud.documentCrud.entities.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDTO {
    private Long id;
    private String name;
    private String path;
    private String key;

    public DocumentDTO(Document doc) {
        this.id = doc.getId();
        this.name = doc.getName();
        this.path = doc.getPath();
        this.key = doc.getKey();
    }
}
