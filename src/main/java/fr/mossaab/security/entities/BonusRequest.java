package fr.mossaab.security.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "bonus_request")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BonusRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Статус запроса.
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RequestStatus status;

    /**
     * Сообщение об отказе.
     */
    @Column(length = 500)
    private String rejectionMessage;
    /**
     * Родительская сущность User.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;
    /**
     * Список фотографий покупки котла.
     */
    @OneToMany(mappedBy = "bonusRequest", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<BoilerPurchasePhoto> boilerPurchasePhotos;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "barcode_id", nullable = false)
    private Barcode barcode;

    public enum RequestStatus {
        PENDING, APPROVED, REJECTED
    }
}