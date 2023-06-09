package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private String titulo, descricao;
    private Integer carhaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO*carhaHoraria;
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
