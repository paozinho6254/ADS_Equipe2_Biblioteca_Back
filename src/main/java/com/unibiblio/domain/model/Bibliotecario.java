package com.unibiblio.domain.model;

import com.unibiblio.domain.enums.Perfil;

public class Bibliotecario extends Usuario {

    public Bibliotecario() {

    }

    public Bibliotecario(int id, String nome, String email, String senhaHash, Perfil perfil) {
        super(id, nome, email, senhaHash, perfil);
    }

}
