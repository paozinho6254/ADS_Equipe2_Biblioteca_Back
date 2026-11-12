package com.unibiblio.domain.model;

import com.unibiblio.domain.enums.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "administradores")
@Inheritance(strategy = InheritanceType.JOINED)
public class Administrador extends Usuario {

    public Administrador(int id, String nome, String email, String senhaHash, Perfil perfil) {
        super(id, nome, email, senhaHash, perfil);
    }

    public void gerarRelatorioAtrasos() {

    }

}