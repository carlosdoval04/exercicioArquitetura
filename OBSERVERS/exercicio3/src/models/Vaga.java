package models;

public class Vaga {
    private String titulo;
    private String descricao;

    public Vaga(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Vaga: " + titulo + " - " + descricao;
    }
}
