package br.senai.jandira.sp;

abstract class Funcionarios {

    String nome;
    double salario;
    int idFuncionario;
    private String nomeAssalariado;
    private double horasTrabalhadas;
    private double taxaHorasExtras;


    public Funcionarios(String nome, double salario, int idFuncionario) {
        this.nome = nome;
        this.salario = salario;
        this.idFuncionario = idFuncionario;
    }

    public Funcionarios(String nome, double salarioFixo, int id, double bonus) {
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int idFuncionario() {
        return idFuncionario;
    }


    public void receberDados(String nomeAssalariado, double horasTrabalhadas, double taxaHorasExtras) {
        this.nomeAssalariado = nomeAssalariado;
        this.horasTrabalhadas = horasTrabalhadas;
        this.taxaHorasExtras = taxaHorasExtras;
    }

    public String getNomeAssalariado() {
        return getNomeAssalariado();
    }

    public double getHorasTrabalhadas() {
        return getHorasTrabalhadas();
    }

    public double getTaxaHorasExtras() {
        return getTaxaHorasExtras();
    }


       public double calcularSalario() {
        return horasTrabalhadas * taxaHorasExtras;
    }

}
