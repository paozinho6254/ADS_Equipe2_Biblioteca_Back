package com.unibiblio.domain.model;

import com.unibiblio.domain.enums.StatusExemplar;

public class Exemplar {

    private String codigoBarras;
    private Livro livro;
    StatusExemplar status;

    public Exemplar() {
    }

    public Exemplar(String codigoBarras, Livro livro, StatusExemplar status) {
        this.codigoBarras = codigoBarras;
        this.livro = livro;
        this.status = status;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public StatusExemplar getStatus() {
        return status;
    }

    public void setStatus(StatusExemplar status) {
        this.status = status;
    }

}
