package com.java_angular.fullstackdevelop.model;

import com.java_angular.fullstackdevelop.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.*;

@Entity//Entidade no banco de dados
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {

    @Id//Chave primaria da tabela no banco
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(unique = true)//Atributo que deve ser unico e não vai se repetir no banco
    @NotEmpty(message = "IP ADDRESS CANNOT BE EMPTY OR NULL")
    private String ipAddress;

    private String name;

    private String memory;

    private String imageUrl;

    private Status status;
}
