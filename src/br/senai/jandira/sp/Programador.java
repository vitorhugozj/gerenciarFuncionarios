package br.senai.jandira.sp;

public class Programador  extends Funcionarios{

    private double bonus;

    public Programador(String nome, double salarioFixo, int id, double bonus) {
    super(nome, salarioFixo, id, bonus);
        this.bonus = bonus;
    }
    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }
}


