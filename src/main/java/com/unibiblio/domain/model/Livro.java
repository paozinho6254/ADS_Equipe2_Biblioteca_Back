package com.unibiblio.domain.model;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private String isbn;
    private String genero;
    private int anoPublicacao;

    public Livro(){

    }
    
    public Livro(int id, String titulo, String autor, String isbn, String genero, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
}