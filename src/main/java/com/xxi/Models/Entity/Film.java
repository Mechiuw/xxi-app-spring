package com.xxi.Models.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_film")
@Builder(toBuilder = true)
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "duration", nullable = false)
    private Integer duration;

    @Column(name = "show_date", nullable = false)
    private Date showDate;

    @Column(name = "price", nullable = false)
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "rating_id", referencedColumnName = "id")
    @JsonBackReference
    private Rating rating;
}
