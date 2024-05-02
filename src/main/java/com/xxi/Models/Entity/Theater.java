package com.xxi.Models.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_theater")
@Builder(toBuilder = true)
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "theater_number",nullable = false, length = 3)
    private String theaterNumber;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "id")
    @JsonBackReference
    private Film film;
}
