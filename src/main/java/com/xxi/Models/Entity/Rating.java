package com.xxi.Models.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_rating")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "code",nullable = false,length = 2)
    private String code;

    @Column(name = "description", nullable = false)
    private String description;
}
