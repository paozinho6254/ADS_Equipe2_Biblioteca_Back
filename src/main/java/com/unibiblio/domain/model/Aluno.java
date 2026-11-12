package com.unibiblio.domain.model;

import com.unibiblio.domain.enums.Perfil;
import jakarta.persistence.Entity;

@Entity
public class Aluno extends Usuario {
    private String matricula;
    private String curso;
    private String endereco;

    public Aluno() {

    }

    public Aluno(int id, String nome, String email, String senhaHash, Perfil perfil, String matricula, String curso,
            String endereco) {
        super(id, nome, email, senhaHash, perfil);
        this.matricula = matricula;
        this.curso = curso;
        this.endereco = endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", curso=" + curso + ", endereco=" + endereco + "]";
    }

}
