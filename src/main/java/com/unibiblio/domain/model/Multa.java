package com.unibiblio.domain.model;

import com.unibiblio.domain.enums.StatusMulta;

public class Multa {

    private int id;
    private double TAXA_DIARIA = 2.0;
    private int diasAtraso;
    private double valor;
    private StatusMulta status;

    public Multa(){

    }
    
    public Multa(int id, double TAXA_DIARIA, int diasAtraso, double valor, StatusMulta status) {
        this.id = id;
        this.TAXA_DIARIA = TAXA_DIARIA;
        this.diasAtraso = diasAtraso;
        this.valor = valor;
        this.status = status;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getTAXA_DIARIA() {
        return TAXA_DIARIA;
    }
    
    public void setTAXA_DIARIA(double TAXA_DIARIA) {
        this.TAXA_DIARIA = TAXA_DIARIA;
    }
    
    public int getDiasAtraso() {
        return diasAtraso;
    }
    
    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public StatusMulta getStatus() {
        return status;
    }
    
    public void setStatus(StatusMulta status) {
        this.status = status;
    }
    
}
