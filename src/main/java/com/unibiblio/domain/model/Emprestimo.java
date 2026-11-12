package com.unibiblio.domain.model;

import java.time.LocalDate;

import com.unibiblio.domain.enums.StatusEmprestimo;

public class Emprestimo {

    private int id;
    private int PRAZO_DIAS = 7;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private LocalDate dataPrevista;
    private StatusEmprestimo status;
    private Aluno aluno;

    public Emprestimo() {

    }

    public Emprestimo(int id, LocalDate dataEmprestimo, LocalDate dataDevolucao, LocalDate dataPrevista,
            StatusEmprestimo status, Aluno aluno) {
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.dataPrevista = dataPrevista;
        this.status = status;
        this.aluno = aluno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPRAZO_DIAS() {
        return PRAZO_DIAS;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(LocalDate dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public StatusEmprestimo getStatus() {
        return status;
    }

    public void setStatus(StatusEmprestimo status) {
        this.status = status;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
