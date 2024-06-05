package fr.mossaab.security.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "document_file_data")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentFileData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String type;

    private String filePath;

    @ManyToOne
    @JoinColumn(name = "DOCUMENT_TITLE_ID")
    @JsonBackReference
    private DocumentTitle documentTitle;
}

