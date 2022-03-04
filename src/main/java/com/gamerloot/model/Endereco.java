package com.gamerloot.model;

import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gl_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 9)
    @NumberFormat(pattern = "#####-###")
    private String cep;

    @Column(nullable = false)
    private int num;
}
