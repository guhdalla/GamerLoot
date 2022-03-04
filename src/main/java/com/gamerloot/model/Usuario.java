package com.gamerloot.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "gl_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String nome;

    @Column(length = 70, nullable = false)
    private String sobrenome;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataDeNascimento;

    @Column(nullable = false, length = 14)
    @NumberFormat(pattern = "###.###.###-##")
    private String cpf;

//    private Endereco endereco;
}