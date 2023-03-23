package br.com.dio.desafio.dominio;

public class Curso {

    private String titulo, descricao;
    private Integer carhaHoraria;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCarhaHoraria() {
        return carhaHoraria;
    }

    public void setCarhaHoraria(Integer carhaHoraria) {
        this.carhaHoraria = carhaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", carhaHoraria=" + carhaHoraria +
                '}';
    }
}
