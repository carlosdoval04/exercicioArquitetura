package model;

public class Aluno {
    private String nome;
    private double p1;
    private double p2;
    private double media;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setP1(double p1) {
        this.p1 = p1;
        calcularMedia();
    }

    public void setP2(double p2) {
        this.p2 = p2;
        calcularMedia();
    }

    private void calcularMedia() {
        this.media = (p1 + p2) / 2;
    }

    public double getMedia() {
        return media;
    }

    public String getNome() {
        return nome;
    }
}
