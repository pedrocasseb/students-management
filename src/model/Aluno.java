package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String turma;
    private String matricula;
    private List<Double> notas;

    public Aluno (String nome, String turma, String matricula, List<Double> notas){
        this.matricula = matricula;
        this.nome = nome;
        this.turma = turma;
        this.notas = new ArrayList<>();
    }

    public String getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public String getTurma() { return turma; }
    public List<Double> getNotas() { return notas; }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        }else {
            System.out.println("Nota inválida...");
        }
    }

    public double calcularMedia() {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public String getSituação() {
        double media = calcularMedia();
        return  media >= 5 ? "Aprovado" : "Reprovado";
    }


}