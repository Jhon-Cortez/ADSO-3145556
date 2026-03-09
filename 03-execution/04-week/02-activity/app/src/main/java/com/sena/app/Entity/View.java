package com.sena.app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "view")
public class View {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    

    @Column(name = "name", nullable = false, length = 100 )
    private String name;

    @Column(name = "description", length = 250)
    private String description;
}
